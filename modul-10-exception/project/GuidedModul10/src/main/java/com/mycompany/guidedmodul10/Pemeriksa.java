package com.mycompany.guidedmodul10;

public class Pemeriksa {

    public void periksa() throws Exception {
        int nilai = 0;
        if (nilai < 5) {
            throw new Exception("Lebih kecil 5");
        }
    }
}