package com.mycompany.modul09;

public class Modul09 {

    public static void main(String[] args) {
        garis("9.1.1 Static Variable");
        DemoStaticVariable.main(args);

        garis("9.1.2 Static Method");
        DemoStaticMethod.main(args);

        garis("9.2 Collection");
        DemoCollection.main(args);

        garis("9.2.1 Sorting");
        DemoSorting.main(args);

        garis("9.2.2 Filtering");
        DemoFiltering.main(args);
    }

    private static void garis(String judul) {
        System.out.println("\n===== " + judul + " =====");
    }
}