package practis.game;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Stack;

// Main application class
public class LabyrinthGame extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        LabyrinthController controller = new LabyrinthController();
        BorderPane root = controller.getView();

        primaryStage.setTitle("Лабіринт зі стеком");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }
}

// Controller class
class LabyrinthController {
    private final LabyrinthModel labyrinthModel;
    private final LabyrinthView labyrinthView;

    public LabyrinthController() {
        this.labyrinthModel = new LabyrinthModel(10, 10);
        this.labyrinthView = new LabyrinthView(labyrinthModel);

        setupListeners();
    }

    private void setupListeners() {
        labyrinthView.getUpButton().setOnAction(e -> move(0, -1));
        labyrinthView.getDownButton().setOnAction(e -> move(0, 1));
        labyrinthView.getLeftButton().setOnAction(e -> move(-1, 0));
        labyrinthView.getRightButton().setOnAction(e -> move(1, 0));
        labyrinthView.getBackButton().setOnAction(e -> goBack());
    }

    private void move(int dx, int dy) {
        if (labyrinthModel.movePlayer(dx, dy)) {
            labyrinthView.update();
            if (labyrinthModel.isWin()) {
                labyrinthView.showWinMessage();
            }
        } else {
            labyrinthView.showErrorMessage("Неможливий хід!");
        }
    }

    private void goBack() {
        if (labyrinthModel.goBack()) {
            labyrinthView.update();
        } else {
            labyrinthView.showErrorMessage("Немає кроків для повернення!");
        }
    }

    public BorderPane getView() {
        return labyrinthView.getRoot();
    }
}

// Model class
class LabyrinthModel {
    private final int width;
    private final int height;
    private final boolean[][] labyrinth;
    private int playerX;
    private int playerY;
    private final Stack<int[]> moves;

    public LabyrinthModel(int width, int height) {
        this.width = width;
        this.height = height;
        this.labyrinth = new boolean[height][width];
        this.playerX = 0;
        this.playerY = 0;
        this.moves = new Stack<>();

        generateLabyrinth();
    }

    private void generateLabyrinth() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                labyrinth[y][x] = Math.random() > 0.2; // 80% прохідних клітин
            }
        }
        labyrinth[0][0] = true; // Стартова точка
        labyrinth[height - 1][width - 1] = true; // Фініш
    }

    public boolean movePlayer(int dx, int dy) {
        int newX = playerX + dx;
        int newY = playerY + dy;

        if (newX >= 0 && newX < width && newY >= 0 && newY < height && labyrinth[newY][newX]) {
            moves.push(new int[]{playerX, playerY});
            playerX = newX;
            playerY = newY;
            return true;
        }
        return false;
    }

    public boolean goBack() {
        if (!moves.isEmpty()) {
            int[] lastMove = moves.pop();
            playerX = lastMove[0];
            playerY = lastMove[1];
            return true;
        }
        return false;
    }

    public boolean isWin() {
        return playerX == width - 1 && playerY == height - 1;
    }

    public boolean[][] getLabyrinth() {
        return labyrinth;
    }

    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }
}

// View class
class LabyrinthView {
    private final LabyrinthModel labyrinthModel;
    private final BorderPane root;
    private final GridPane labyrinthGrid;
    private final Text infoText;
    private final Text errorText;
    private final Button upButton;
    private final Button downButton;
    private final Button leftButton;
    private final Button rightButton;
    private final Button backButton;

    public LabyrinthView(LabyrinthModel labyrinthModel) {
        this.labyrinthModel = labyrinthModel;
        this.root = new BorderPane();
        this.labyrinthGrid = new GridPane();
        this.infoText = new Text();
        this.errorText = new Text();
        this.upButton = new Button("Вгору");
        this.downButton = new Button("Вниз");
        this.leftButton = new Button("Вліво");
        this.rightButton = new Button("Вправо");
        this.backButton = new Button("Назад");

        setupLayout();
        update();
    }

    private void setupLayout() {
        labyrinthGrid.setAlignment(Pos.CENTER);
        labyrinthGrid.setHgap(2);
        labyrinthGrid.setVgap(2);

        HBox controls = new HBox(10, leftButton, upButton, downButton, rightButton, backButton);
        controls.setAlignment(Pos.CENTER);

        root.setTop(infoText);
        root.setCenter(labyrinthGrid);
        root.setBottom(controls);
        root.setRight(errorText);
    }

    public void update() {
        labyrinthGrid.getChildren().clear();
        boolean[][] labyrinth = labyrinthModel.getLabyrinth();
        for (int y = 0; y < labyrinth.length; y++) {
            for (int x = 0; x < labyrinth[y].length; x++) {
                Rectangle cell = new Rectangle(40, 40);
                cell.setFill(labyrinth[y][x] ? Color.WHITE : Color.BLACK);
                if (x == labyrinthModel.getPlayerX() && y == labyrinthModel.getPlayerY()) {
                    cell.setFill(Color.BLUE);
                }
                labyrinthGrid.add(cell, x, y);
            }
        }
        infoText.setText("Поточна позиція: (" + labyrinthModel.getPlayerX() + ", " + labyrinthModel.getPlayerY() + ")");
        errorText.setText("");
    }

    public void showWinMessage() {
        infoText.setText("Ви виграли! Знайдено вихід.");
    }

    public void showErrorMessage(String message) {
        errorText.setText(message);
    }

    public Button getUpButton() {
        return upButton;
    }

    public Button getDownButton() {
        return downButton;
    }

    public Button getLeftButton() {
        return leftButton;
    }

    public Button getRightButton() {
        return rightButton;
    }

    public Button getBackButton() {
        return backButton;
    }

    public BorderPane getRoot() {
        return root;
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Стек
        Deque<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek()); // 20
        stack.pop();

        // Черга
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.peek()); // 10
        queue.poll();

        // Множина
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        System.out.println(set.contains(10)); // true
        set.remove(10);
    }
}

