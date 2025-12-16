# Zootopia_Pet_Project
A program that allows the user to create virtual pets.
<img width="731" height="444" alt="Zootopia Class Diagram drawio" src="https://github.com/user-attachments/assets/30bc7739-33fc-4738-a20b-85c5f923f6f1" />

# Zootopia Pet Project

## Description
Zootopia Pet Project is a virtual pet simulator inspired by the characters from the movie Zootopia. Users can choose from four different animal characters—Gary, Gazelle, Judy, and Nick—and take care of them by performing various actions to maintain their health, energy, and happiness levels. The game ends if any of the animal's stats reach zero, simulating the consequences of neglect.

## Features
- **Animal Selection**: Choose from four unique Zootopia characters, each with their own special actions.
- **Basic Care Actions**: Sleep, eat, play, and do nothing to manage the animal's stats.
- **Special Actions**: Each animal has a unique sixth action (e.g., Gary can receive hugs, Gazelle can sing).
- **Stat Management**: Monitor and maintain health, energy, and happiness levels.
- **Random Events**: Occasional random mishaps that can decrease stats unexpectedly.
- **Game Over Condition**: The program ends if any stat drops to zero or below.

## How the Code Works
The project is written in Java and follows object-oriented programming principles. The `Animal` interface defines the common methods and properties for all animals, including getters and setters for health, energy, and happiness. Each animal class (Gary, Gazelle, Judy, Nick) implements this interface and provides specific implementations for actions, some with additional attributes like temperature for Gary.

The main game loop in `Main.java` handles user input, executes actions, applies random events, and checks for game-ending conditions. Stats are clamped between 0 and 100, and the game continues until the user quits or an animal's stats reach zero.

## How to Run the Program
### Prerequisites
- Java Development Kit (JDK) installed on your system (version 11 or higher recommended).
- A terminal or command prompt to compile and run the program.

### Step-by-Step Instructions
1. **Clone or Download the Project**: Ensure all Java files (`Main.java`, `Animal.java`, `Gary.java`, `Gazelle.java`, `Judy.java`, `Nick.java`) are in the same directory.

2. **Open a Terminal**: Navigate to the directory containing the Java files.

3. **Compile the Program**:
   ```
   javac *.java
   ```
   This command compiles all Java files in the directory.

4. **Run the Program**:
   ```
   java Main
   ```
   This starts the Zootopia Pet Project.

5. **Play the Game**:
   - Follow the on-screen prompts to choose an animal and perform actions.
   - The game will continue until you choose to quit or an animal's stats reach zero.

## Authors
- **Vivi** - Programming Lead
- **Ryan** - Technical Writer
- **Eva** - Project Manager
- **Amirah** - Quality Assurance Tester

## What We Learned
Through this project, we gained valuable experience in Java programming, including implementing interfaces, inheritance, and polymorphism. We learned the importance of modular code design, user input handling, and random event simulation. Additionally, we improved our skills in version control, collaborative coding, and testing to ensure a robust and enjoyable user experience. The project also highlighted the challenges of balancing game mechanics and the significance of clear documentation for maintainability.
