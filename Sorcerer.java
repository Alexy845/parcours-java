public class Sorcerer extends Character implements Healer {
    private int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }
    public void setHealCapacity(int healCapacity) {
        this.healCapacity = healCapacity;
    }

    @Override
    public void heal(Character character) { 
        int newHealth = character.getCurrentHealth() + healCapacity;
        int maxHealth = character.getMaxHealth();
        if (newHealth > maxHealth) {
            newHealth = maxHealth;
        }
        character.setCurrentHealth(newHealth); 
        character.heal(healCapacity);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() <= 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + getHealCapacity() + " HP.";
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP.";
    }


}