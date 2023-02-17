public class Sorcerer extends Character implements Healer {
    private Weapon weapon;
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.weapon = weapon;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }
    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        if (currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }
        if (damage > currentHealth){
            currentHealth = 0;
        }else{
            currentHealth -= damage;
        }

    }
    @Override
    public void attack(Character character) throws DeadCharacterException{
        if (character.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(character);
        }
        int damage = (weapon == null) ? 10 : weapon.getDamage();
        heal(this);
        character.takeDamage(damage);

    }
    @Override
    public void heal(Character c) throws DeadCharacterException{
        if (c.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(c);
        }
        int newHealth = c.getCurrentHealth() + this.healCapacity;
        c.setCurrentHealth(Math.min(newHealth, c.getMaxHealth()));

    }

    @Override
    public String toString() {
        if (getCurrentHealth() <= 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + getHealCapacity() + " HP." + (this.weapon != null ? " He has the weapon " + this.weapon.toString() : "") + ".";
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP." + (this.weapon != null ? " He has the weapon " + this.weapon.toString() : "") + ".";
    }


}