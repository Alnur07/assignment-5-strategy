public class DefensiveStrategy implements CombatStrategy {

    @Override
    public void executeCombat() {
        System.out.println("Warrior uses defensive combat!");
        System.out.println("Damage dealt: 10");
        System.out.println("Damage received: 5");
    }
}
