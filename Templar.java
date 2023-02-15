public class Templar extends Character implements Healer,Tank{
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public void takeDamage(int damage) {
        int damageAfterShield = damage - shield;
        if (damageAfterShield > currentHealth){
            currentHealth = 0;
        } else {
            currentHealth -= damageAfterShield;
        }
    }
    public void attack(Character character) {
        heal(this);
        character.takeDamage(6);
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
    public int getShield() {
        return shield;
    }

    @Override
    public String toString() {
        if (getCurrentHealth() <= 0) {
            return getName() + " has been beaten, even with its " + getShield() + " shield. So bad, it could heal " + getHealCapacity() + " HP.";
        }
        return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP and has a shield of " + getShield() + ".";
    }
}
