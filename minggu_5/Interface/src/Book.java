package Interface.src;

public class Book extends Goods implements Taxable {
    private String author;

    // Constructor
    public Book(String description, double price, String author) {
        super(description, price);
        this.author = author;
    }

    // Getter
    public String getAuthor() {
        return author;
    }

    // Setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // Implementasi method calculateTax()
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    // Menampilkan informasi buku
    @Override
    public void display() {
        super.display();
        System.out.println("Author: " + author);
        System.out.println("Tax: " + calculateTax());
    }
}
