package com.mycompany.modul09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFiltering {

    public static void main(String[] args) {
        List<Pegawai> daftar = new ArrayList<>();
        daftar.add(new Pegawai("bobby", 3000));
        daftar.add(new Pegawai("erick", 1600));
        daftar.add(new Pegawai("rey", 2500));
        daftar.add(new Pegawai("anna", 3500));

        // 1a. Gaji minimal 3000 - cara konvensional
        System.out.println("Employee with salary minimal 3000 (konvensional)");
        for (Pegawai p : daftar) {
            if (p.getSalary() >= 3000) {
                System.out.println(p);
            }
        }

        // 1b. Gaji minimal 3000 - lambda
        System.out.println("\nEmployee with salary minimal 3000 (lambda)");
        List<Pegawai> hasil = daftar.stream()
                .filter(p -> p.getSalary() >= 3000)
                .collect(Collectors.toList());
        hasil.forEach(System.out::println);

        // 2a. Cari nama erick - cara konvensional
        System.out.println("\nEmployee erick (konvensional)");
        for (Pegawai p : daftar) {
            if (p.getName().equals("erick")) {
                System.out.println(p);
            }
        }

        // 2b. Cari nama erick - lambda
        System.out.println("\nEmployee erick (lambda)");
        Pegawai ketemu = daftar.stream()
                .filter(p -> p.getName().equals("erick"))
                .findFirst()
                .orElse(null);
        System.out.println(ketemu);
    }
}