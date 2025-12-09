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
    }

    // Method to check and display the current stats
    public void checkStats() {
        System.out.println("Current Stats:");
        System.out.println("Health: " + this.health);
        System.out.println("Energy: " + this.energy);
        System.out.println("Happiness: " + this.happiness);
    }
}