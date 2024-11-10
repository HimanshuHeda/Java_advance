// 2) Write a program to calculate the room rent of a restaurant depending on the number of stays.

package Assignment;

class Library {
    private String bookTitle;

    public Library(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int calculateFine(int daysLate) {
        if (daysLate <= 15) {
            return 0; // No fine
        } else {
            return (daysLate - 15) * 2; // Rs 2 fine per day after 15 days
        }
    }

    public String getBookTitle() {
        return bookTitle;
    }
}

// Example usage
public class LibraryFine {
    public static void main(String[] args) {
        Library book1 = new Library("Python Programming");
        int fine1 = book1.calculateFine(10);
        System.out.println("Fine for '" + book1.getBookTitle() + "' returned 10 days late: Rs " + fine1);

        Library book2 = new Library("Data Structures");
        int fine2 = book2.calculateFine(20);
        System.out.println("Fine for '" + book2.getBookTitle() + "' returned 20 days late: Rs " + fine2);
    }
}
