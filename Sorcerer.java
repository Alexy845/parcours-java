public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character character) { 
        int currentHealth = character.getCurrentHealth();
        int maxHealth = character.getMaxHealth();
        int healAmount = Math.min(maxHealth - currentHealth, healCapacity);
        int newHealth = currentHealth + healAmount;
        character.setCurrentHealth(newHealth);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() <= 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + getHealCapacity() + " HP.";
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP.";
    }


}