public class BalancedStrategy implements CombatStrategy {

    @Override
    public void executeCombat() {
        System.out.println("Warrior uses balanced combat!");
        System.out.println("Damage dealt: 20");
        System.out.println("Damage received: 10");
    }
}
