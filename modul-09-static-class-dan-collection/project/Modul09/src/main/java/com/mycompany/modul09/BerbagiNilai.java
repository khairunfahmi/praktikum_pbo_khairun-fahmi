package com.mycompany.modul09;

public class BerbagiNilai {

    private int nilaiPribadi;
    private static int nilaiBersama;

    public BerbagiNilai(int pribadi, int bersama) {
        this.nilaiPribadi = pribadi;
        BerbagiNilai.nilaiBersama = bersama;
    }

    @Override
    public String toString() {
        return nilaiPribadi + " " + nilaiBersama;
    }
}