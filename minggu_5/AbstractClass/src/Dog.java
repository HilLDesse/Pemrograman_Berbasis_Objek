package AbstractClass.src;

public class Dog extends Animal {

    // Constructor
    public Dog(String nama, String asal, int jumlahKaki) {
        super(nama, asal, jumlahKaki);
    }

    // Implementasi abstract method
    @Override
    public void toShout() {
        System.out.println("Guk guk!");
    }
}
