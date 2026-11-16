package com.mycompany.unguidedmodul09;

public class HasilEksperimen implements Comparable<HasilEksperimen> {

    // Static variable: dimiliki class, menghitung seluruh objek yang dibuat
    private static int jumlahEksperimen = 0;

    private final String namaModel;
    private final double akurasi;
    private final int waktuTraining;

    public HasilEksperimen(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++;
    }

    // Static method: dipanggil lewat nama class tanpa membuat objek
    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    @Override
    public String toString() {
        return "Model=" + namaModel
                + ", akurasi=" + akurasi
                + ", waktu=" + waktuTraining + " detik";
    }

    // Urutan default: akurasi dari tertinggi ke terendah
    @Override
    public int compareTo(HasilEksperimen lain) {
        return Double.compare(lain.akurasi, this.akurasi);
    }
}
