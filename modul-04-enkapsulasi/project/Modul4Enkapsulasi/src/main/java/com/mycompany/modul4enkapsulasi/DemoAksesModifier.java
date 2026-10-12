package com.mycompany.modul4enkapsulasi;

public class DemoAksesModifier {
    public static void main(String[] args) {
        Manusia m = new Manusia();

        m.setNama("Budi");
        m.setUmur(20);

        System.out.println("Nama: " + m.getNama());
        System.out.println("Umur: " + m.getUmur());
    }
}