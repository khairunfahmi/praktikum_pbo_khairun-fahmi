package com.mycompany.unguidedmodul07;

public abstract class TiketBioskop implements ItemTransaksi {
    private String judulFilm;
    private double hargaDasar;
    private int jumlahKursi;

    // Konstruktor dengan kata kunci this eksplisit
    public TiketBioskop(String judulFilm, double hargaDasar, int jumlahKursi) {
        this.judulFilm = judulFilm;
        this.hargaDasar = hargaDasar;
        this.jumlahKursi = jumlahKursi;
    }

    public String getJudulFilm() {
        return this.judulFilm;
    }

    public double getHargaDasar() {
        return this.hargaDasar;
    }

    public int getJumlahKursi() {
        return this.jumlahKursi;
    }

    // Abstract method internal spesifik tiket
    public abstract double hitungTotalBayar();

    @Override
    public abstract String getNamaTransaksi();

    // Mewujudkan kontrak antarmuka ItemTransaksi dengan memanggil hitungTotalBayar()
    @Override
    public double getNominalBayar() {
        return hitungTotalBayar();
    }
}