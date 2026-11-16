package com.mycompany.unguidedmodul09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UnguidedModul09 {

    public static void main(String[] args) {
        // Data disimpan di List dengan generics
        List<HasilEksperimen> daftar = new ArrayList<>();
        daftar.add(new HasilEksperimen("Logistic Regression", 0.82, 12));
        daftar.add(new HasilEksperimen("Random Forest", 0.91, 45));
        daftar.add(new HasilEksperimen("SVM", 0.87, 60));
        daftar.add(new HasilEksperimen("KNN", 0.79, 5));
        daftar.add(new HasilEksperimen("Decision Tree", 0.84, 8));

        // 1. Jumlah eksperimen (static method)
        System.out.println("Jumlah eksperimen: " + HasilEksperimen.getJumlahEksperimen());

        // 2. Urut akurasi tertinggi (Comparable)
        Collections.sort(daftar);
        System.out.println("Sorted by akurasi");
        daftar.forEach(System.out::println);

        // 3. Urut waktu tercepat (Comparator)
        Collections.sort(daftar, new PembandingWaktu());
        System.out.println("Sorted by waktu training");
        daftar.forEach(System.out::println);

        // 4. Filtering akurasi minimal 0.85 (lambda)
        System.out.println("Model dengan akurasi minimal 0.85");
        List<HasilEksperimen> terpilih = daftar.stream()
                .filter(h -> h.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        terpilih.forEach(System.out::println);

        // 5. Pencarian model "KNN" (lambda), tampilkan null jika tidak ada
        System.out.println("Pencarian model KNN");
        HasilEksperimen ketemu = daftar.stream()
                .filter(h -> h.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(ketemu);
    }
}