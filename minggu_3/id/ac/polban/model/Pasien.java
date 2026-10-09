package id.ac.polban.model;

public class Pasien {
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String riwayatPenyakit;

    private static int totalPasien = 0;

    public Pasien(String newNama, int newUmur, String newJenisKelamin, String newRiwayatPenyakit) {
        nama = newNama;
        umur = newUmur;
        jenisKelamin = newJenisKelamin;
        riwayatPenyakit = newRiwayatPenyakit;

        totalPasien++;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getRiwayatPenyakit() {
        return riwayatPenyakit;
    }

    public static int getTotalPasien() {
        return totalPasien;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public void setUmur(int newUmur) {
        umur = newUmur;
    }

    public void setJenisKelamin(String newJenisKelamin) {
        jenisKelamin = newJenisKelamin;
    }

    public void setRiwayatPenyakit(String newRiwayatPenyakit) {
        riwayatPenyakit = newRiwayatPenyakit;
    }

    public void infoPasien() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Riwayat Penyakit: " + riwayatPenyakit);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
    }

}