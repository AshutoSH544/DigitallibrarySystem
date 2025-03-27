package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Digital Library Management System ---");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: libraryManager.addBook(); break;
                case 2: libraryManager.viewAllBooks(); break;
                case 3: libraryManager.searchBook(); break;
                case 4: libraryManager.updateBook(); break;
                case 5: libraryManager.deleteBook(); break;
                case 6: System.out.println("Exiting system. Goodbye!"); break;
                default: System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
