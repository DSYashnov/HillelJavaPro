package practis.game;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;
import java.util.Stack;

// Main application class
public class StackGame extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackGameController controller = new StackGameController();
        Pane root = controller.getView();

        primaryStage.setTitle("Башта зі стеком");
        primaryStage.setScene(new Scene(root, 400, 600));
        primaryStage.show();
    }
}

// Controller class
class StackGameController {
    private final StackModel stackModel;
    private final StackView stackView;
    private int score;
    private Integer targetBlock; // Block to be removed

    public StackGameController() {
        this.stackModel = new StackModel();
        this.stackView = new StackView(stackModel);
        this.score = 0;
        this.targetBlock = null;

        setupListeners();
    }

    private void setupListeners() {
        stackView.getPushButton().setOnAction(e -> {
            if (stackModel.pushBlock()) {
                stackView.animatePush();
                selectTargetBlock(); // Update the target block whenever a new block is added
            } else {
                stackView.showError("Максимальний розмір стеку досягнуто!");
            }
        });

        stackView.getPopButton().setOnAction(e -> {
            if (stackModel.getStack().isEmpty()) {
                stackView.showError("Стек порожній!");
                return;
            }

            Integer removedBlock = stackModel.popBlock();
            if (removedBlock.equals(targetBlock)) {
                stackView.animatePop();
                updateScore(10); // Add 10 points for each correct pop
                selectTargetBlock();
            } else {
                stackView.showGameOver();
                resetGame();
            }
        });
    }

    private void selectTargetBlock() {
        Stack<Integer> stack = stackModel.getStack();
        if (!stack.isEmpty()) {
            Random random = new Random();
            targetBlock = stack.get(random.nextInt(stack.size()));
            stackView.updateTargetBlock(targetBlock);
        }
    }

    private void updateScore(int points) {
        score += points;
        stackView.updateScore(score);
    }

    private void resetGame() {
        stackModel.clearStack();
        stackView.update();
        score = 0;
        stackView.updateScore(score);
        targetBlock = null;
    }

    public Pane getView() {
        return stackView.getRoot();
    }
}

// Model class
class StackModel {
    private final Stack<Integer> stack;
    private final int MAX_BLOCKS = 10;

    public StackModel() {
        this.stack = new Stack<>();
    }

    public boolean pushBlock() {
        if (stack.size() < MAX_BLOCKS) {
            stack.push((int) (Math.random() * 100)); // Random number for the block
            return true;
        }
        return false;
    }

    public Integer popBlock() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public void clearStack() {
        stack.clear();
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}

// View class
class StackView {
    private final StackModel stackModel;
    private final Pane root;
    private final VBox stackDisplay;
    private final Button pushButton;
    private final Button popButton;
    private final Text infoText;
    private final Text errorText;
    private final Text scoreText;
    private final Text targetText;

    public StackView(StackModel stackModel) {
        this.stackModel = stackModel;
        this.root = new Pane();
        this.stackDisplay = new VBox();
        this.pushButton = new Button("Додати блок");
        this.popButton = new Button("Видалити блок");
        this.infoText = new Text();
        this.errorText = new Text();
        this.scoreText = new Text("Очки: 0");
        this.targetText = new Text("Цільовий блок: -");

        setupLayout();
        update();
    }

    private void setupLayout() {
        stackDisplay.setLayoutX(150);
        stackDisplay.setLayoutY(100);

        pushButton.setLayoutX(50);
        pushButton.setLayoutY(500);

        popButton.setLayoutX(200);
        popButton.setLayoutY(500);

        infoText.setLayoutX(20);
        infoText.setLayoutY(50);

        errorText.setLayoutX(20);
        errorText.setLayoutY(70);
        errorText.setFill(Color.RED);

        scoreText.setLayoutX(20);
        scoreText.setLayoutY(90);

        targetText.setLayoutX(20);
        targetText.setLayoutY(110);

        root.getChildren().addAll(stackDisplay, pushButton, popButton, infoText, errorText, scoreText, targetText);
    }

    public void animatePush() {
        int blockHeight = 40;
        Stack<Integer> stack = stackModel.getStack();
        int newBlockValue = stack.peek();

        Rectangle block = new Rectangle(100, blockHeight);
        block.setFill(Color.LIGHTBLUE);
        Text blockText = new Text(String.valueOf(newBlockValue));
        blockText.setLayoutX(35);
        blockText.setLayoutY(blockHeight / 2 + 5);

        Pane blockPane = new Pane(block, blockText);
        blockPane.setLayoutY(-blockHeight);

        stackDisplay.getChildren().add(0, blockPane);

        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.5), blockPane);
        transition.setToY(stack.size() * blockHeight);
        transition.setOnFinished(e -> update());
        transition.play();
    }

    public void animatePop() {
        if (!stackDisplay.getChildren().isEmpty()) {
            Pane topBlock = (Pane) stackDisplay.getChildren().get(0);

            TranslateTransition transition = new TranslateTransition(Duration.seconds(0.5), topBlock);
            transition.setToY(-50);
            transition.setOnFinished(e -> {
                stackDisplay.getChildren().remove(topBlock);
                update();
            });
            transition.play();
        }
    }

    public void update() {
        infoText.setText("Розмір стеку: " + stackModel.getStack().size());
    }

    public void updateScore(int score) {
        scoreText.setText("Очки: " + score);
    }

    public void updateTargetBlock(Integer targetBlock) {
        targetText.setText("Цільовий блок: " + targetBlock);
    }

    public void showError(String message) {
        errorText.setText(message);
    }

    public void showGameOver() {
        errorText.setText("Гра закінчена! Башта обвалилася.");
    }

    public Button getPushButton() {
        return pushButton;
    }

    public Button getPopButton() {
        return popButton;
    }

    public Pane getRoot() {
        return root;
    }
}
