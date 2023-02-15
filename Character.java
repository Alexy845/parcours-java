import java.util.ArrayList;
import java.util.List;

public class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List <Character> allCharacters = new ArrayList<>();
    
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public void setCurrentHealth(int health) {
        this.currentHealth = health;
    }
    public String getName() {
        return name;
    }

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
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
    public void allCharacters() {
        allCharacters.add(this);

    }
    public static String printStatus() {
        String miseEnPage = "------------------------------------------";
        String res = miseEnPage+"\n"+"Characters currently fighting :";
        if (allCharacters.isEmpty()){
            return miseEnPage+"\n"+"Nobody's fighting right now !"+"\n"+miseEnPage ;
        }
        for (Character character : allCharacters) {
            res = res +"\n - "+character ;
        }
        res = res +"\n"+miseEnPage;
        return res;
    }

    public static Character fight(Character character1, Character character2) {
        while (character1.getCurrentHealth() > 0 || character2.getCurrentHealth() > 0) {
            character1.attack(character2);
        if (character2.getCurrentHealth() <= 0) {
            return character1;
        }
        character2.attack(character1); 
        if (character1.getCurrentHealth() <= 0) {
            return character2;
            }
        }
        return null;
    
    }

    @Override
    public String toString() {

        if (currentHealth <= 0) {
            return getName() + " : KO";
        }
        return getName() + " : " + getCurrentHealth() + "/" + getMaxHealth();


    }
    public void heal(int i) {
    }
}

