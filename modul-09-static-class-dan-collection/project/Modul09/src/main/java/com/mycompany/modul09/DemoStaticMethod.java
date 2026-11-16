package com.mycompany.modul09;

public class DemoStaticMethod {

    public static void main(String[] args) {
        for (int angka = 0; angka < 10; angka++) {
            boolean genap = (angka % 2 == 0);
            if (genap) {
                MesinHitung.tambah();
            }
        }
        System.out.println(MesinHitung.jumlah);
    }
}