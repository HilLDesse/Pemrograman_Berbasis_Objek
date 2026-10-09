import id.ac.polban.model.Pasien;
import id.ac.polban.model.PasienAnak;
import id.ac.polban.model.PasienDewasa;
import id.ac.polban.service.PasienService;

public class MainPasien {
    public static void main(String[] args) {
        PasienService service = new PasienService();

        Pasien p1 = new PasienAnak(
                "Hilmi",
                12,
                "Laki-laki",
                "Flu"
        );

        Pasien p2 = new PasienDewasa(
                "Rafi",
                20,
                "Laki-laki",
                "Demam"
        );

        Pasien p3 = new PasienDewasa(
                "Putra",
                21,
                "Laki-laki",
                "Flu"
        );

        service.tambahPasien(p1);
        service.tambahPasien(p2);
        service.tambahPasien(p3);

        service.tampilkanSemuaPasien();

        System.out.println(
                "Total Pasien: " + Pasien.getTotalPasien()
        );
    }
}