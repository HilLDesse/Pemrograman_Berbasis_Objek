package id.ac.polban.model;

public class PasienAnak extends Pasien {

    public PasienAnak(
            String nama,
            int umur,
            String jenisKelamin,
            String riwayatPenyakit) {

        super(nama, umur, jenisKelamin, riwayatPenyakit);
    }

    @Override
    public void infoPasien() {
        System.out.println("Kategori: Pasien Anak");
        super.infoPasien();
    }
}