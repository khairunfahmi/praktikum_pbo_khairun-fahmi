package com.mycompany.guidedmodul07;

public class Shoe implements Product {
    @Override
    public int getPrice(int id) {
        if (id == 1) {
            return 5;
        } else {
            return 10;
        }
    }

    public String getMaker() {
        return MAKER;
    }
}