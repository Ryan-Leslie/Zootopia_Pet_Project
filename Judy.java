public class Judy {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    // Setter methods to modify attributes
    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(100, health));
    }

    public void setEnergy(int energy) {
        this.energy = Math.max(0, Math.min(100, energy));
    }

    public void setHappiness(int happiness) {
        this.happiness = Math.max(0, Math.min(100, happiness));
    }

    // Getter methods to retrieve attributes
    public int getHealth() {
        return this.health;
    }  

    public int getEnergy() {
        return this.energy;
    }

    public int getHappiness() {
        return this.happiness;
    }

    // Method to sleep
    public void sleep() {
        System.out.println("Judy is sleeping...");
        this.energy += 30;
        this.health += 10;
    }

    // Method to eat
    public void eat() {
        System.out.println("Judy is eating...");
        this.energy += 15;
        this.health += 5;
        this.happiness -= 1;
    }

    // Method to do nothing
    public void doNothing() {
        System.out.println("Judy is doing nothing...");
        this.energy -= 2;
        this.health -= 1;
        this.happiness -= 2;
    }
    // Method to solve a case with loop and randomness
    public void solveCase(int num) {
        System.out.println("Judy is working on solving case #" + num + "...");

        // Simulate solving the case in steps
        for (int i = 1; i <= 3; i++) {
            System.out.println("Working on step " + i + " of the case...");
            this.energy -= 5; // Each step reduces energy
            this.health -= 2; // Each step slightly reduces health

            // Ensure stats don't drop below zero
            if (this.energy < 0) this.energy = 0;
            if (this.health < 0) this.health = 0;
        }

        // Randomly determine if the case is solved successfully
        boolean caseSolved = new java.util.Random().nextBoolean();

        if (caseSolved) {
            System.out.println("Judy successfully solved case #" + num + "!");
            this.happiness += 10; // Success increases happiness
        } else {
            System.out.println("Judy couldn't solve case #" + num + "...");
            this.happiness -= 5; // Failure decreases happiness
            this.energy -= 5; // Failure uses more energy
        }

        // Ensure stats remain within valid ranges
        if (this.happiness > 100) this.happiness = 100;
        if (this.happiness < 0) this.happiness = 0;
        if (this.energy < 0) this.energy = 0;

        // Display updated stats
        checkStats();
    }

    // Method for Judy to play and increase happiness
    public void play() {
        System.out.println("Judy is playing and having fun!");
        this.happiness += 20; // Playing makes Judy much happier
        this.energy -= 10; // Playing uses up energy
        this.health -= 5; // Playing too much can slightly reduce health

        // Ensure stats don't drop below zero
        if (health < 0) health = 0;
        if (energy < 0) energy = 0;
        if (happiness > 100) happiness = 100;

        System.out.println("Judy had a great time playing!");
    }

    // Method to check and display stats
    public void checkStats() {
        System.out.println("Current Stats:");
        System.out.println("Health: " + this.health);
        System.out.println("Energy: " + this.energy);
        System.out.println("Happiness: " + this.happiness);
    }

}   