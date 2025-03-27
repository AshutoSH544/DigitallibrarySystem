package library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add a book
    public void addBook() {
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();

        // Check if Book ID is unique
        for (Book b : books) {
            if (b.getBookID().equals(bookID)) {
                System.out.println("Book ID already exists!");
                return;
            }
        }

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter Availability Status (Available/Checked Out): ");
        String status = scanner.nextLine();

        if (!status.equalsIgnoreCase("Available") && !status.equalsIgnoreCase("Checked Out")) {
            System.out.println("Invalid status. Setting default to 'Available'.");
            status = "Available";
        }

        Book book = new Book(bookID, title, author, genre, status);
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // View all books
    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            book.displayBook();
        }
    }

    // Search for a book
    public void searchBook() {
        System.out.print("Enter Book ID or Title to search: ");
        String query = scanner.nextLine();
        for (Book book : books) {
            if (book.getBookID().equalsIgnoreCase(query) || book.getTitle().equalsIgnoreCase(query)) {
                System.out.println("Book Found:");
                book.displayBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Update book details
    public void updateBook() {
        System.out.print("Enter Book ID to update: ");
        String bookID = scanner.nextLine();

        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                System.out.println("1. Update Title");
                System.out.println("2. Update Author");
                System.out.println("3. Update Genre");
                System.out.println("4. Update Availability Status");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter new Title: ");
                        book.setTitle(scanner.nextLine());
                        break;
                    case 2:
                        System.out.print("Enter new Author: ");
                        book.setAuthor(scanner.nextLine());
                        break;
                    case 3:
                        System.out.print("Enter new Genre: ");
                        book.setGenre(scanner.nextLine());
                        break;
                    case 4:
                        System.out.print("Enter new Status (Available/Checked Out): ");
                        book.setAvailabilityStatus(scanner.nextLine());
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        return;
                }
                System.out.println("Book updated successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Delete a book
    public void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        String bookID = scanner.nextLine();
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                books.remove(book);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
