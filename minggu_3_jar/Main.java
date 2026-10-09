import id.ac.polban.model.Pasien;
import id.ac.polban.service.PasienService;

public class Main {
    public static void main(String[] args) {

        PasienService service = new PasienService();

        Pasien pasien = new Pasien(
            "Budi",
            22,
            "Laki-laki",
            "Batuk"
        );

        service.tambahPasien(pasien);

        service.tampilkanSemuaPasien();
        
        System.out.println("Total Pasien: " + Pasien.getTotalPasien());
    }
}