import java.util.Arrays;

public class LibraryManagementSystem {

    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Binary search method
    public static Book binarySearch(Book[] books, String targetTitle) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(targetTitle);

            if (comparison == 0) {
                return books[mid];
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("B001", "To Kill a Mockingbird", "Harper Lee"),
            new Book("B002", "1984", "George Orwell"),
            new Book("B003", "Moby Dick", "Herman Melville"),
            new Book("B004", "The Great Gatsby", "F. Scott Fitzgerald")
        };

        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Search Book by Title (Linear Search)");
            System.out.println("2. Search Book by Title (Binary Search)");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter book title to search: ");
                    String titleLinear = scanner.nextLine();
                    Book bookLinear = linearSearch(books, titleLinear);
                    if (bookLinear != null) {
                        System.out.println("Book found: " + bookLinear);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter book title to search: ");
                    String titleBinary = scanner.nextLine();
                    Book bookBinary = binarySearch(books, titleBinary);
                    if (bookBinary != null) {
                        System.out.println("Book found: " + bookBinary);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
