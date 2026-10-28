public class AggressiveStrategy implements CombatStrategy {

    @Override
    public void executeCombat() {
        System.out.println("Warrior attacks aggressively!");
        System.out.println("Damage dealt: 30");
        System.out.println("Damage received: 20");
    }
}
