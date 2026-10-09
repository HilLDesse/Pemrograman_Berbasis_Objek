package Interface.src;

public class Toy extends Goods implements Taxable {
    private int minimumAge;

    // Constructor
    public Toy(String description, double price, int minimumAge) {
        super(description, price);
        this.minimumAge = minimumAge;
    }

    // Getter
    public int getMinimumAge() {
        return minimumAge;
    }

    // Setter
    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    // Implementasi method calculateTax()
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    // Menampilkan informasi mainan
    @Override
    public void display() {
        super.display();
        System.out.println("Minimum Age: " + minimumAge);
        System.out.println("Tax: " + calculateTax());
    }
}