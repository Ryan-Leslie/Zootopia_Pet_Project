import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of animals
        Animal judy = new Judy();
        Animal nick = new Nick();
        Animal gazelle = new Gazelle();
        Animal gary = new Gary();

        System.out.println("Welcome to the Zootopia Animal Program!");

        // Main program loop
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Judy - Sleep");
            System.out.println("2. Nick - Eat");
            System.out.println("3. Gazelle - Play");
            System.out.println("4. Check stats for all animals");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                judy.sleep(); // Judy sleeps
            } else if (choice == 2) {
                nick.eat(); // Nick eats
            } else if (choice == 3) {
                gazelle.play(); // Gazelle plays
            } else if (choice == 4) {
                System.out.println("\nStats for all animals:");
                System.out.println("Judy:");
                judy.checkStats();
                System.out.println("Nick:");
                nick.checkStats();
                System.out.println("Gazelle:");
                gazelle.checkStats();
            } else if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}