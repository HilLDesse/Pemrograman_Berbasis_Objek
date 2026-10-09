import id.ac.polban.model.Pasien;
import id.ac.polban.service.PasienService;

public class MainPasien {
    public static void main(String[] args) {

        PasienService service = new PasienService();

        Pasien p1 = new Pasien("Hilmi", 19, "Laki-laki", "Flu");
        Pasien p2 = new Pasien("Rafi", 20, "Laki-laki", "Demam");
        Pasien p3 = new Pasien("Putra", 21, "Laki-laki", "Flu");

        service.tambahPasien(p1);
        service.tambahPasien(p2);
        service.tambahPasien(p3);

        service.tampilkanSemuaPasien();

        System.out.println("Total Pasien: " + Pasien.getTotalPasien());
    }
}