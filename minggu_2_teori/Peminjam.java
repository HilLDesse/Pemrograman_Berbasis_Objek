package minggu_2_teori;

public class Peminjam {
    private String nama_barang;
    private String nama_peminjam;
    private String kelas;
    private String tanggal_pinjam;
    private String waktu_pinjam;
    private String jaminan;

    public Peminjam(String newNamaBarang, String newNamaPeminjam, String newKelas, String newTanggalPinjam, String newWaktuPinjam, String newJaminan) {
        nama_barang = newNamaBarang;
        nama_peminjam = newNamaPeminjam;
        kelas = newKelas;
        tanggal_pinjam = newTanggalPinjam;
        waktu_pinjam = newWaktuPinjam;
        jaminan = newJaminan;
        
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public String getNamaPeminjam() {
        return nama_peminjam;
    }

    public String getKelas() {
        return kelas;
    }

    public String getTanggalPinjam() {
        return tanggal_pinjam;
    }

    public String getWaktuPinjam() {
        return waktu_pinjam;
    }

    public String getJaminan() {
        return jaminan;
    }

    public void setNamaBarang(String newNamaBarang) {
        nama_barang = newNamaBarang;
    }

    public void setNamaPeminjam(String newNamaPeminjam) {
        nama_peminjam = newNamaPeminjam;
    }

    public void setKelas(String newKelas) {
        kelas = newKelas;
    }

    public void setTanggalPinjam(String newTanggalPinjam) {
        tanggal_pinjam = newTanggalPinjam;
    }

    public void setWaktuPinjam(String newWaktuPinjam) {
        waktu_pinjam = newWaktuPinjam;
    }

    public void setJaminan(String newJaminan) {
        jaminan = newJaminan;
    }

    public void infoPeminjam() {
        System.out.println("Nama Barang: " + nama_barang);
        System.out.println("Nama Peminjam: " + nama_peminjam);
        System.out.println("Kelas: " + kelas);
        System.out.println("Tanggal Pinjam: " + tanggal_pinjam);
        System.out.println("Waktu Pinjam: " + waktu_pinjam);
        System.out.println("Jaminan: " + jaminan);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
    }

}