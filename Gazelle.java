import java.util.Random;
public class Gazelle {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    // No-argument constructor
    public Gazelle() {  
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
    }

    // Parameterized constructor
    public Gazelle(int health, int energy, int happiness) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }

    // Getter and Setter for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and Setter for energy
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // Getter and Setter for happiness
    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    // Method to simulate doing nothing
    public void doNothing() {
        //Doing nothing decreases energy, health, and happiness by 5
        this.energy -= 5;
        this.happiness -= 5;
        this.health -= 5;
    }

    // Method for Gazelle to play and increase happiness
    public void play() {
        System.out.println("Gazelle is playing and having fun!");
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

    public void sing() {
        Random random = new Random();
        int songNumber = random.nextInt(5) + 1; // Random number between 1 and 5

        // Select a song based on the random number
        String selectedSong;
        if (songNumber == 1) {
            selectedSong = "Try Everything";
        } else if (songNumber == 2) {
            selectedSong = "Can't Stop the Feeling";
        } else if (songNumber == 3) {
            selectedSong = "Shakira's Anthem";
        } else if (songNumber == 4) {
            selectedSong = "Feel the Beat";
        } else {
            selectedSong = "Zootopia Groove";
        }

        // Simulate Gazelle singing the song
        System.out.println("Gazelle starts singing: \"" + selectedSong + "\"");

        // Adjust stats
        this.happiness += 15; // Singing makes Gazelle happier
        this.energy -= 10; // Singing uses up energy

        // Ensure stats remain within valid ranges
        if (this.happiness > 100) this.happiness = 100;
        if (this.energy < 0) this.energy = 0;

        // Display updated stats
        checkStats();
    }

    // Method to check stats with separate print statements
    public void checkStats() {
    System.out.println("Gazelle Stats:");
    System.out.println("Health: " + health);
    System.out.println("Energy: " + energy);
    System.out.println("Happiness: " + happiness);
}

}