import java.util.Random;

public class Creature {
    private static final Random rand = new Random();
    
    private String name;
    private int age;
    private double health;
    private double hunger;
    private double thirst;
    private double reproductiveChance;
    private double deathChance;
    
    public Creature(String name) {
        this.name = name;
        this.age = 0;
        this.health = 1.0;
        this.hunger = 0.0;
        this.thirst = 0.0;
        this.reproductiveChance = 0.1;
        this.deathChance = 0.05;
    }
    
    public void update() {
        // Update age and decrease health, hunger, and thirst
        this.age++;
        this.health -= 0.01;
        this.hunger += 0.01;
        this.thirst += 0.01;
        
        // Roll for reproductive chance and reproduce if successful
        if (rand.nextDouble() < reproductiveChance) {
            reproduce();
        }
        
        // Roll for death chance and die if unsuccessful
        if (rand.nextDouble() < deathChance) {
            die();
        }
    }
    
    public void die() {
        System.out.println(this.name + " has died!");
    }
    
    public void reproduce() {
        System.out.println(this.name + " has reproduced!");
    }
}
