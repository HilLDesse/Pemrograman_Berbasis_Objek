package id.ac.polban.service;

import java.util.ArrayList;
import java.util.List;

import id.ac.polban.model.Pasien;

public class PasienService {

    private List<Pasien> daftarPasien;

    public PasienService() {
        daftarPasien = new ArrayList<>();
    }

    // Dependency
    public void tampilkanPasien(Pasien pasien) {
        pasien.infoPasien();
    }

    // Aggregation
    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public void tampilkanSemuaPasien() {
        for (Pasien pasien : daftarPasien) {
            pasien.infoPasien();
        }
    }
}