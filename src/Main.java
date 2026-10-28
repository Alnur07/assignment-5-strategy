import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Character warrior = new Character(new BalancedStrategy());

        int choice;

        do {
            System.out.println("\n=== Game Character Combat System ===");
            System.out.println("1. Aggressive");
            System.out.println("2. Defensive");
            System.out.println("3. Balanced");
            System.out.println("0. Exit");

            System.out.print("Choose your combat strategy: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                warrior.setStrategy(new AggressiveStrategy());
            } else if (choice == 2) {
                warrior.setStrategy(new DefensiveStrategy());
            } else if (choice == 3) {
                warrior.setStrategy(new BalancedStrategy());
            } else if (choice == 0) {
                System.out.println("Exiting game...");
            } else {
                System.out.println("Invalid choice!");
            }

            if (choice >= 1 && choice <= 3) {
                warrior.fight();
            }

        } while (choice != 0);

        scanner.close();
    }

}