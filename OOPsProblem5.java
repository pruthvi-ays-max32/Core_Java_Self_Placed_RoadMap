// 💡 Task:
// 1️⃣ Create a Book class with:
// Private variables: title and price.
// A constructor using this to assign values.
// 2️⃣ Add a showDetails() method to display the book details.
// 3️⃣ Create an object, set values, and print details.

class Book {
    private String title;
    private int price;

    // Default Constructor
    Book() {
        this("The Art of Being Alone", 200);
        System.out.println("📖 Default Book Created!"); 
    }

    // Parameterized Constructor
    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void showDetails() {
        System.out.printf("📚 Title: %s | 💰 Price: ₹%d%n", title, price);
    }

    public static void main(String args[]) {
        Book b1 = new Book();  // Calls default constructor
        Book b2 = new Book("Wings of Fire", 100);

        b1.showDetails();
        b2.showDetails();
    }
}
