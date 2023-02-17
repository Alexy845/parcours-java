public class Templar extends Character implements Healer,Tank{
    private Weapon weapon;
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
        this.weapon = weapon;
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        if (currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }
        int damageAfterShield = damage - shield;
        if (damageAfterShield > currentHealth){
            currentHealth = 0;
        } else {
            currentHealth -= damageAfterShield;
        }

    }
    public void attack(Character character) throws DeadCharacterException{
        if (character.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(character);
        }
        int damage = (weapon == null) ? 6 : weapon.getDamage();
        heal(this);
        character.takeDamage(damage);

    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }
    @Override
    public void heal(Character c) throws DeadCharacterException {
        if (c.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(c);
        }
        int newHealth = c.getCurrentHealth() + this.healCapacity;
        c.setCurrentHealth(Math.min(newHealth, c.getMaxHealth()));

    }
    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public String toString() {
        if (getCurrentHealth() <= 0) {
            return getName() + " has been beaten, even with its " + getShield() + " shield. So bad, it could heal " + getHealCapacity() + " HP." + (this.weapon != null ? " He has the weapon " + this.weapon.toString() : "") + ".";
        }
        return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP and has a shield of "  + (this.weapon != null ? " He has the weapon " + this.weapon.toString() : "") + ".";
    }
}

