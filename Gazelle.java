/**
 * Represents Gazelle, a character with attributes like health, energy, and happiness.
 * This class provides methods to interact with Gazelle, such as eating, sleeping, and playing.
 * @author Amirah B, Ryan L, Vivi L, Eva C, Copilot
 */
import java.util.Random;
public class Gazelle implements Animal {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    /** Default constructor for Gazelle. Initializes health, energy, and happiness to 100. */
    public Gazelle() {     
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
    }

    /** Parameterized constructor for Gazelle.
     * @param health initial health value
     * @param energy initial energy value
     * @param happiness initial happiness value
     */
    public Gazelle(int health, int energy, int happiness) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }

    /** Gets the current health level of Gazelle.
     * @return the health value
     */
    @Override
    public int getHealth() {
        return health;
    }

    /** Sets the health of Gazelle.
     * @param health the health value to set
     */
    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    /** Gets the current energy level of Gazelle.
     * @return the energy value
     */
    @Override
    public int getEnergy() {
        return energy;
    }

    /** Sets the energy of Gazelle.
     * @param energy the energy value to set
     */
    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /** Gets the current happiness level of Gazelle.
     * @return the happiness value
     */
    @Override
    public int getHappiness() {
        return happiness;
    }

    /** Sets the happiness of Gazelle.
     * @param happiness the happiness value to set
     */
    @Override
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    /** Simulates Gazelle doing nothing, decreasing energy, health, and happiness by 5. */
    @Override
    public void doNothing() {
        //Doing nothing decreases energy, health, and happiness by 5
        this.energy -= 5;
        this.happiness -= 5;
        this.health -= 5;
    }

    /** Allows Gazelle to play, increasing happiness and decreasing energy and health. */
    @Override
    public void play() {
        System.out.println("Gazelle is playing and having fun singing with you!");
        this.happiness += 20; // Playing makes Gazelle much happier
        this.energy -= 10; // Playing uses up energy
        this.health -= 5; // Playing too much can slightly reduce health

        // Ensure stats don't drop below zero
        if (health < 0) health = 0;
        if (energy < 0) energy = 0;
        if (happiness > 100) happiness = 100;

        System.out.println("Gazelle had a great time playing!");
        checkStats(); // Display updated stats
    }
    /** Allows Gazelle to sleep, increasing energy and health. */
    @Override
    public void sleep() {
        System.out.println("Gazelle is sleeping and resting!");
        this.energy += 30;
        this.health += 10;
        validateStats();
    }

    /** Allows Gazelle to eat, increasing energy and health, slightly decreasing happiness. */
    @Override
    public void eat() {
        System.out.println("Gazelle is eating to boost her energy!");
        this.energy += 15;
        this.health += 5;
        this.happiness -= 1;
        validateStats();
    }
    /** Allows Gazelle to sing a random song, increasing happiness and decreasing energy. */
    public void sing() {
        Random random = new Random();
        int songNumber = random.nextInt(5) + 1; // Random number between 1 and 5

        // Select a song based on the random number
        String selectedSong = switch (songNumber) {
            case 1 -> "Try Everything";
            case 2 -> "Can't Stop the Feeling";
            case 3 -> "Shakira's Anthem";
            case 4 -> "Feel the Beat";
            default -> "Zootopia Groove";
        };

        // Simulate Gazelle singing the song
        System.out.println("Gazelle starts singing: \"" + selectedSong + "\"");

        // Adjust stats
        this.happiness += 15; // Singing makes Gazelle happier
        this.energy -= 10; // Singing uses up energy

        // Ensure stats remain within valid ranges
        if (this.happiness > 100) this.happiness = 100;
        if (this.energy < 0) this.energy = 0;

    }
    
    /** Validates and adjusts stats to ensure they are within valid ranges. */
    public void validateStats() {
        // Ensure stats don't drop below zero
        if (health < 0) health = 0;
        if (energy < 0) energy = 0;
        if (happiness > 100) happiness = 100;
    }

    /** Displays Gazelle's current stats. */
    @Override
    public void checkStats() {
    System.out.println("Gazelle Stats:");
    System.out.println("Health: " + health);
    System.out.println("Energy: " + energy);
    System.out.println("Happiness: " + happiness);
}

}
