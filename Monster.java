public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
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
        character.takeDamage(7);
    } 
    @Override
    public String toString() {
        if (getCurrentHealth() > 0) {
            return getName() + " is a monster with " + getCurrentHealth() + " HP";
        } else {
            return getName() + " is a monster and is dead";
        }
    }
}
