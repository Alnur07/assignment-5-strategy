public class Character {

    private CombatStrategy strategy;

    public Character(CombatStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CombatStrategy strategy) {
        this.strategy = strategy;
    }

    public void fight() {
        strategy.executeCombat();
    }
}
