package com.mycompany.unguidedmodul07;

public interface ItemTransaksi {
    // Kontrak metode abstrak
    double getNominalBayar();
    String getNamaTransaksi();

    // Default method Java 8+ untuk mencetak baris rincian item
    default void cetakRincianItem() {
        System.out.println(getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }

    // Static method Java 8+ untuk pencatatan log sistem kasir
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}