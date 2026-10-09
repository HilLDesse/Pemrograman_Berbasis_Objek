package id.ac.polban.model;

public class PasienDewasa extends Pasien {

    public PasienDewasa(
            String nama,
            int umur,
            String jenisKelamin,
            String riwayatPenyakit) {

        super(nama, umur, jenisKelamin, riwayatPenyakit);
    }

    @Override
    public void infoPasien() {
        System.out.println("Kategori: Pasien Dewasa");
        super.infoPasien();
    }
}