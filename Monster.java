public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }
    @Override
    public void takeDamage(int damage) {
        if (damage > currentHealth){
            currentHealth = 0;
        }else{
            int healthAfterDamage = getCurrentHealth() - (int) (0.8 * damage);
            setCurrentHealth(healthAfterDamage);
        }
    }
    @Override
    public void attack (Character Uruk) {
        Uruk.takeDamage(7);
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
