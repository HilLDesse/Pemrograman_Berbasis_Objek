package Interface.src;

public class MainGoods {

    public static void main(String[] args) {

        // Membuat objek Food, Toy, dan Book
        Food food = new Food("Roti", 10000, 250);
        Toy toy = new Toy("Mobil Mainan", 100000, 3);
        Book book = new Book("Pemrograman Java", 150000, "Budi");

        // Menguji kelas Food
        System.out.println("=== FOOD ===");
        food.display();

        System.out.println();

        // Menguji kelas Toy
        System.out.println("=== TOY ===");
        toy.display();

        System.out.println();

        // Menguji kelas Book
        System.out.println("=== BOOK ===");
        book.display();

        System.out.println();

        // Menguji interface Taxable
        System.out.println("=== TEST INTERFACE TAXABLE ===");

        Taxable[] taxableItems = {toy, book};

        for (Taxable item : taxableItems) {
            System.out.println(
                "Pajak: " + item.calculateTax()
            );
        }
    }
}