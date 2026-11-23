package com.mycompany.guidedmodul10;

public class DemoThrows {

    public static void main(String[] args) {
        Pemeriksa pemeriksa = new Pemeriksa();
        try {   
            pemeriksa.periksa();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program Selesai");
    }
}