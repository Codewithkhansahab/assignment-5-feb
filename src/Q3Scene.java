import java.util.LinkedList;
import java.util.Scanner;

// Book class to represent book details
class Book {
    int bookId;
    String bookTitle;
    String author;
    String issueToStudentName;

    Book(int bookId, String bookTitle, String author, String issueToStudentName) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.issueToStudentName = issueToStudentName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", issueToStudentName='" + issueToStudentName + '\'' +
                '}';
    }
}

public class Q3Scene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Book> issuedBooks = new LinkedList<>();

        // Main menu for the library system
        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add a new issued book");
            System.out.println("2. Remove a returned book");
            System.out.println("3. Check if a bookId is currently issued");
            System.out.println("4. Display all issued books");
            System.out.println("5. Exit the system");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    // Add a new issued book
                    System.out.println("\nEnter the following details to issue a book:");
                    System.out.print("Book ID: ");
                    int bookId = Integer.parseInt(sc.nextLine());
                    System.out.print("Book Title: ");
                    String bookTitle = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Student Name who issued the book: ");
                    String studentName = sc.nextLine();

                    Book newBook = new Book(bookId, bookTitle, author, studentName);
                    issuedBooks.add(newBook);
                    System.out.println("Book has been successfully issued!");
                    break;

                case 2:
                    // Remove a returned book
                    System.out.print("Enter the book ID to remove the returned book: ");
                    int idToRemove = Integer.parseInt(sc.nextLine());
                    boolean bookRemoved = false;

                    for (Book book : issuedBooks) {
                        if (book.bookId == idToRemove) {
                            issuedBooks.remove(book);
                            System.out.println("Book with ID " + idToRemove + " has been successfully removed.");
                            bookRemoved = true;
                            break;
                        }
                    }

                    if (!bookRemoved) {
                        System.out.println("Book with ID " + idToRemove + " is not found in the issued list.");
                    }
                    break;

                case 3:
                    // Check if a bookId is currently issued
                    System.out.print("Enter the book ID to check: ");
                    int idToCheck = Integer.parseInt(sc.nextLine());
                    boolean isIssued = false;

                    for (Book book : issuedBooks) {
                        if (book.bookId == idToCheck) {
                            System.out.println("Book with ID " + idToCheck + " is currently issued:");
                            System.out.println(book);
                            isIssued = true;
                            break;
                        }
                    }

                    if (!isIssued) {
                        System.out.println("Book with ID " + idToCheck + " is not currently issued.");
                    }
                    break;

                case 4:
                    // Display all issued books
                    System.out.println("List of all books currently issued:");
                    if (issuedBooks.isEmpty()) {
                        System.out.println("No books are currently issued.");
                    } else {
                        for (Book book : issuedBooks) {
                            System.out.println(book);
                        }
                    }
                    break;

                case 5:
                    // Exit the system
                    System.out.println("Exiting the system. Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}