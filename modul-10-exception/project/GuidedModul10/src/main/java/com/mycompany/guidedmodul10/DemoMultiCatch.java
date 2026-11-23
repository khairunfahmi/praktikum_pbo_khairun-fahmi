package com.mycompany.guidedmodul10;

public class DemoMultiCatch {

    public static void main(String[] args) {
        System.out.println("Tanpa parameter:");
        jalankan(new String[]{});

        System.out.println("\nSatu parameter:");
        jalankan(new String[]{"param1"});

        System.out.println("\nDua parameter:");
        jalankan(new String[]{"param1", "param2"});
    }

    private static void jalankan(String[] parameter) {
        try {
            int jumlah = parameter.length;
            int hasil = 100 / jumlah;
            int[] angka = {10, 11};
            hasil = angka[jumlah];
            System.out.println("Tidak terjadi eksepsi");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi eksepsi karena pembagian dengan nol");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi eksepsi karena indeks di luar kapasitas array");
        }
        System.out.println("Setelah blok try catch");
    }
}