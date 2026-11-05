package com.mycompany.guidedmodul07;

public interface MyInterface {
    default void newMethod() {
        System.out.println("Newly added default method");
    }

    static void anotherNewMethod() {
        System.out.println("Newly added static method");
    }

    void existingMethod(String str);
}