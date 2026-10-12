package com.mycompany.modul4enkapsulasi;

public class MainDataset {
    public static void main(String[] args) {
        Dataset d1 = new Dataset();
        d1.setNama("Titanic");
        d1.setJumlahBaris(891);
        d1.setJumlahKolom(12);
        d1.setJumlahMissing(866);

        Dataset d2 = new Dataset("Wine Quality");

        Dataset d3 = new Dataset("Iris", 150, 5, 0);

        Dataset[] arrayDataset = {d1, d2, d3};

        LaporanDataset laporan = new LaporanDataset();

        for (Dataset d : arrayDataset) {
            laporan.cetak(d);
        }

        System.out.println("Total dataset dibuat : "
                + Dataset.getTotalDataset());
    }
}