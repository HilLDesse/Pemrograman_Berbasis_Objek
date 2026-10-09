package AbstractClass.src;

public abstract class Animal {
    private String nama;
    private String asal;
    private int jumlahKaki;

    // Constructor
    public Animal(String nama, String asal, int jumlahKaki) {
        this.nama = nama;
        this.asal = asal;
        this.jumlahKaki = jumlahKaki;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    // Abstract method
    public abstract void toShout();

    // Concrete method
    public void toEat() {
        System.out.println("like to eat");
    }
}
