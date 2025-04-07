package hw_15;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть своє ім'я: ");
        String playerName = scanner.nextLine();

        System.out.print("Введіть кількість ігор: ");
        int totalRounds = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        int wins = 0, losses = 0, draws = 0;
        String[] choices = {"камінь", "ножиці", "папір"};

        Random random = new Random();
        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("\nРаунд " + round + ": Введіть камінь, ножиці або папір (або 'вихід' для припинення): ");
            String playerChoice = scanner.nextLine().toLowerCase();
            if (playerChoice.equals("вихід")) {
                break;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];
            System.out.println("Комп'ютер обрав: " + computerChoice);

            int result = determineWinner(playerChoice, computerChoice);
            if (result == 1) {
                wins++;
                System.out.println("Ви виграли!");
            } else if (result == -1) {
                losses++;
                System.out.println("Ви програли!");
            } else {
                draws++;
                System.out.println("Нічия!");
            }
        }
        System.out.println("\nГра завершена!");
        System.out.println("Зіграно ігор: " + (wins + losses + draws));
        System.out.println("Перемог: " + wins);
        System.out.println("Поразок: " + losses);
        System.out.println("Нічиїх: " + draws);

        scanner.close();
    }
    public static int determineWinner(String player, String computer) {
        if (player.equals(computer)) return 0;
        if ((player.equals("камінь") && computer.equals("ножиці")) ||
                (player.equals("ножиці") && computer.equals("папір")) ||
                (player.equals("папір") && computer.equals("камінь"))) {
            return 1;
        }
        return -1;
    }
}

