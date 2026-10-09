package AbstractClass.src;

public class Lion extends Animal {

    // Constructor
    public Lion(String nama, String asal, int jumlahKaki) {
        super(nama, asal, jumlahKaki);
    }

    // Implementasi abstract method
    @Override
    public void toShout() {
        System.out.println("Roar!");
    }
}
