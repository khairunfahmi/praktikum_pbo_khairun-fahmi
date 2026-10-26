package com.mycompany.modelml;

public class ModelML {
    private String nama;
    private int jumlahData;

    public ModelML(String nama, int jumlahData) {
        this.nama = nama;
        this.jumlahData = jumlahData;
    }

    // cara bagi kelas lain membaca jumlah data latih
    public int getJumlahData() {
        return jumlahData;
    }

    public void tampilkanInfo() {
        System.out.println("Model: " + nama + " | Data latih: " + jumlahData);
    }

    // OVERLOADING 1: tanpa parameter
    public int hitungBiaya() {
        return jumlahData * 2;
    }

    // OVERLOADING 2: dengan parameter epoch
    public int hitungBiaya(int epoch) {
        return jumlahData * epoch;
    }
}