package AbstractClass.src;

public class MainAnimal {

    public static void main(String[] args) {

        // Membuat objek hewan
        Animal[] animals = {
            new Dog("Anjing", "Indonesia", 4),
            new Chicken("Ayam", "Indonesia", 2),
            new Lion("Singa", "Afrika", 4)
        };

        // Menguji setiap objek
        for (Animal animal : animals) {

            System.out.println("Nama: " + animal.getNama());
            System.out.println("Asal: " + animal.getAsal());
            System.out.println("Jumlah kaki: " + animal.getJumlahKaki());

            System.out.print("Suara: ");
            animal.toShout();

            System.out.print("Makanan: ");
            animal.toEat();

            System.out.println("-------------------------");
        }
    }
}
