package com.mycompany.unguidedmodul09;

import java.util.Comparator;

public class PembandingWaktu implements Comparator<HasilEksperimen> {

    // Urutan: waktu training dari tercepat ke terlama
    @Override
    public int compare(HasilEksperimen h1, HasilEksperimen h2) {
        return Integer.compare(h1.getWaktuTraining(), h2.getWaktuTraining());
    }
}