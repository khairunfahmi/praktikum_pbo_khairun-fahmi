package com.mycompany.modelml;

public class ModelRegresi extends ModelML {
    private int jumlahFitur;

    public ModelRegresi(String nama, int jumlahData, int jumlahFitur) {
        super(nama, jumlahData);
        this.jumlahFitur = jumlahFitur;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah fitur: " + jumlahFitur);
    }

    // OVERRIDE: biaya induk + (fitur x 10)
    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahFitur * 10);
    }

    // OVERLOADING baru: epoch dan ukuran batch
    public int hitungBiaya(int epoch, int ukuranBatch) {
        return getJumlahData() * epoch / ukuranBatch;
    }
}