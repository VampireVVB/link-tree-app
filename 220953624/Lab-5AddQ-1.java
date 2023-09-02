import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int edition;

    // Constructor
    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    // toString method to display book details
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nEdition: " + edition + "\n";
    }
}

class BookList {
    public static void main(String[] args) {
        // Create a list of 6 Book objects in ascending order of author names
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Author1", 1));
        books.add(new Book("Book2", "Author2", 1));
        books.add(new Book("Book3", "Author2", 2));
        books.add(new Book("Book4", "Author3", 1));
        books.add(new Book("Book5", "Author3", 2));
        books.add(new Book("Book6", "Author4", 1));

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an author's name
        System.out.print("Enter the author's name: ");
        String inputAuthor = scanner.nextLine();

        // Display books written by the input author
        boolean foundBooks = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(inputAuthor)) {
                System.out.println(book);
                foundBooks = true;
            }
        }

        // If no books were found for the input author
        if (!foundBooks) {
            System.out.println("No books found by " + inputAuthor);
        }

        // Close the scanner
        scanner.close();
    }
}