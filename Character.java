public class Character {

    private int maxHealth;
    private int currentHealth;
    private String name;

    public int getMaxHealth() {
        return maxHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public String getName() {
        return name;
    }

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public void takeDamage(int damage) {
        if (damage > currentHealth){
            currentHealth = 0;
        }else{
            currentHealth -= damage;
        }
    }
    public void attack (Character Uruk) {
        Uruk.takeDamage(9);
    }


    @Override
    public String toString() {

        if (currentHealth <= 0) {
            return getName() + " KO";
        }
        return getName() + " : " + getCurrentHealth() + "/" + getMaxHealth();


    }
}

