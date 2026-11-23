package com.mycompany.guidedmodul10;

public class DemoFinally {

    public static void main(String[] args) {
        int posisi = 3;
        int[] angka = {10, 11, 12};

        try {
            System.out.println(angka[posisi]);
            System.out.println("Tidak Terjadi Eksepsi");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi Eksepsi");
            System.out.println(angka[posisi - 4]);
        } finally {
            System.out.println("Program Selesai");
        }
    }
}