package Interface.src;

public class Goods {
    private String description;
    private double price;

    // Constructor
    public Goods(String description, double price) {
        this.description = description;
        this.price = price;
    }

    // Getter
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // Setter
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method untuk menampilkan informasi barang
    public void display() {
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }
}

