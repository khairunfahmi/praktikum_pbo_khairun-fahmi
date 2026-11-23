package com.mycompany.guidedmodul10;

public class DemoTryCatch {

    public static void main(String[] args) {
        try {
            int[] larik = new int[1];
            System.out.println(larik[1]);
            System.out.println("Baris ini tidak akan pernah dieksekusi...");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi eksepsi karena indeks di luar kapasitas array");
        }
        System.out.println("Sesudah blok try catch");
    }
}