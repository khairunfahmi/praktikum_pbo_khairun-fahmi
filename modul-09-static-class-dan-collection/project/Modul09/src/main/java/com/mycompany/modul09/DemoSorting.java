package com.mycompany.modul09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoSorting {

    public static void main(String[] args) {
        List<Pegawai> daftar = new ArrayList<>();
        daftar.add(new Pegawai("bobby", 3000));
        daftar.add(new Pegawai("erick", 1600));
        daftar.add(new Pegawai("rey", 2500));
        daftar.add(new Pegawai("anna", 3500));

        // a. Comparable
        Collections.sort(daftar);
        System.out.println("Sorted by name");
        daftar.forEach(System.out::println);

        // b. Comparator
        Collections.sort(daftar, new PembandingGaji());
        System.out.println("\nSorted by salary");
        daftar.forEach(System.out::println);
    }
}