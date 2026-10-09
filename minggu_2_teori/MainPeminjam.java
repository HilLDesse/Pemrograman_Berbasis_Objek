package minggu_2_teori;

public class MainPeminjam {
    public static void main(String[] args) {

        Peminjam m1 = new Peminjam("Proyektor", "Hilmi Kautsar", "2B-D3", "2026-09-20", "10:00", "KTM");
        m1.infoPeminjam();

        Peminjam m2 = new Peminjam("Terminal", "Rafi Ardi", "2B-D3", "2026-09-01", "13:00", "KTP");
        m2.infoPeminjam();

        Peminjam m3 = new Peminjam("Proyektor + Terminal", "Putra Suyapratama", "2B-D3", "2026-09-26", "07:00", "KTM");
        m3.infoPeminjam();
    }

}
