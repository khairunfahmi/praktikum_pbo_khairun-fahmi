package com.mycompany.modul09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class DemoCollection {

    public static void main(String[] args) {
        // ---- Generics ----
        Collection<String> himpunan = new HashSet<>();
        List<Integer> daftarAngka = new ArrayList<>();
        himpunan.add("A");
        daftarAngka.add(10);
        System.out.println("HashSet<String>  : " + himpunan);
        System.out.println("List<Integer>    : " + daftarAngka);

        // ---- Method pada Collection ----
        Collection<String> pertama = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Collection<String> kedua = new ArrayList<>(Arrays.asList("b", "c", "d"));

        pertama.add("e");
        System.out.println("add e          : " + pertama);

        pertama.remove("e");
        System.out.println("remove e       : " + pertama);

        pertama.addAll(kedua);
        System.out.println("addAll kedua   : " + pertama);

        pertama.removeAll(Arrays.asList("d"));
        System.out.println("removeAll d    : " + pertama);

        pertama.retainAll(kedua);
        System.out.println("retainAll kedua: " + pertama);

        System.out.println("contains b     : " + pertama.contains("b"));

        // ---- Cara mengakses semua elemen ----
        List<Object> data = new ArrayList<>();
        data.add(200);
        data.add("Hello");
        data.add(235);
        data.add("Donny");

        System.out.println("\nNormal loop");
        for (int idx = 0; idx < data.size(); idx++) {
            System.out.println(data.get(idx));
        }

        System.out.println("for-element loop");
        for (Object item : data) {
            System.out.println(item);
        }

        System.out.println("loop using iterator");
        Iterator<Object> it = data.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("loop using lambda expression");
        data.forEach(x -> System.out.println(x));

        System.out.println("loop using reference");
        data.forEach(System.out::println);
    }
}