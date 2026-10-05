package com.mycompany.praktikummodul3;

import java.util.Arrays;

public class UnguidedModul3 {
    public static void main(String[] args) {
        double[] suhuHarian = {
            30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9
        };

        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        int indexKosong = pengolah.cariIndexKosong();

        System.out.println();
        System.out.println("Index hari kosong (dimulai dari 0): " + indexKosong);

        pengolah.isiDataKosong();

        System.out.println();
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();

        System.out.printf("%nRata-rata : %.2f°C%n", pengolah.hitungRataRata());

        System.out.println();
        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));

        /*
         * Array suhuHarian di main ikut berubah karena array merupakan
         * tipe data reference. Constructor PengolahSuhu menyimpan
         * referensi ke array yang sama, bukan membuat salinan array.
         * Jadi ketika isiDataKosong() mengubah isi array melalui object
         * PengolahSuhu, perubahan tersebut juga terlihat pada array
         * suhuHarian yang berada di main.
         */
    }
}