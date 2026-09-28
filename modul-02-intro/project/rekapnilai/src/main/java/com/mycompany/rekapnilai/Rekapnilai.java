package com.mycompany.rekapnilai;

public class Rekapnilai {

    public static void main(String[] args) {

        final double KKM = 75.0;

        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};

        double[][] nilai = {
            {80.0, 85.0},
            {70.0, 65.0},
            {90.0, 90.0}
        };

        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        System.out.println();

        for (int i = 0; i < namaMahasiswa.length; i++) {

            double total = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }

            double rataRata = total / nilai[i].length;

            String status;

            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1 : " + nilai[i][0]);
            System.out.println("Nilai Modul 2 : " + nilai[i][1]);
            System.out.println("Rata-rata      : " + rataRata);
            System.out.println("Status         : " + status);
            System.out.println();
        }
    }
}