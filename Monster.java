public class Monster extends Character {
    private Weapon weapon;
    
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.weapon = weapon;
    }
    @Override
    public void takeDamage(int damage) {
        if (damage > currentHealth) {
            currentHealth = 0;
        } else {
            int damageAfterReduction = (int) Math.floor(damage * 0.8);
            currentHealth -= damageAfterReduction;
        }
    }
    
    @Override
    public void attack(Character character) {
        int damage = (weapon == null) ? 7 : weapon.getDamage();
        character.takeDamage(damage);
    } 
    @Override
    public String toString() {
        if (getCurrentHealth() > 0) {
            return getName() + " is a monster with " + getCurrentHealth() + " HP." + (this.weapon != null ? " He has the weapon " + this.weapon.toString() : "") + ".";
        } else {
            return getName() + " is a monster and is dead." + (this.weapon != null ? " He has the weapon " + this.weapon.toString() : "") + ".";
        }
    }
}
