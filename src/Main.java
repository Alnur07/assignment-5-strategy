import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("== Game Character Combat System ==");

        Character warrior = new Character(new AggresiveStrategy());

        System.out.println("\nSelected strategy: Aggressive");
        warrior.fight();

        warrior.setStrategy(new DefensiveStrategy());

        System.out.println("\nSelected strategy: Defensive");
        warrior.fight();

        warrior.setStrategy(new BalancedStrategy());

        System.out.println("\nSelected strategy: Balanced");
        warrior.fight();

    }
}
