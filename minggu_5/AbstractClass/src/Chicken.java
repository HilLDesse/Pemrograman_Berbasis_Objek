package AbstractClass.src;

public class Chicken extends Animal {

    // Constructor
    public Chicken(String nama, String asal, int jumlahKaki) {
        super(nama, asal, jumlahKaki);
    }

    // Implementasi abstract method
    @Override
    public void toShout() {
        System.out.println("Kukuruyuk!");
    }
}
