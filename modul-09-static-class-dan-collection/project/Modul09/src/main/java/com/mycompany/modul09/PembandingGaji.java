package com.mycompany.modul09;

import java.util.Comparator;

public class PembandingGaji implements Comparator<Pegawai> {

    @Override
    public int compare(Pegawai p1, Pegawai p2) {
        return Integer.compare(p1.getSalary(), p2.getSalary());
    }
}