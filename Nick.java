public class Nick {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    // Default constructor
    public Nick() {
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
    }

    // Parameterized constructor
    public Nick(int health, int energy, int happiness) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }

    // Getters and setters (optional, if needed)
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    // Method to simulate doing nothing
    public void doNothing() {
        // Doing nothing decreases energy and happiness slightly
        this.energy -= 5;
        this.happiness -= 5;
        // Health remains unchanged
        validateStats();
    }

    // Eat pawpsicles to increase energy and happiness
    public void eatPawpsicle(int num) {
        System.out.println("Nick is eating a pawpsicle...");
        if (num <= 3 && num > 0) {
            this.energy += num * 5; // Each pawpsicle gives 5 energy
            this.happiness += num * 3; // Each pawpsicle gives 3 happiness
        }
        else {
            System.out.println("Nick can only eat up to 3 pawpsicles at a time!");
        }
        validateStats();
    }

    // Check if stats are within valid range
    public void validateStats() {
        // Ensure stats don't drop below zero
        if (health < 0) health = 0;
        if (energy < 0) energy = 0;
        if (happiness > 100) happiness = 100;
    }

    // Method to sleep
    public void sleep() {
        System.out.println("Nick is sleeping...");
        this.energy += 30;
        this.health += 10;
        validateStats();
    }

    // Method to eat
    public void eat() {
        System.out.println("Nick is eating...");
        this.energy += 15;
        this.health += 5;
        this.happiness -= 1;
        validateStats();
    }

    // Method to check and display the current stats
    public void checkStats() {
        System.out.println("Current Stats:");
        System.out.println("Health: " + this.health);
        System.out.println("Energy: " + this.energy);
        System.out.println("Happiness: " + this.happiness);
    }
}