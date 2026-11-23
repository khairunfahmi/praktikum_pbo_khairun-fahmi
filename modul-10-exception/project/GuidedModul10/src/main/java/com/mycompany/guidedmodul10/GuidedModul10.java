package com.mycompany.guidedmodul10;

public class GuidedModul10 {

    public static void main(String[] args) {
        garis("10.4 Try Catch");
        DemoTryCatch.main(args);

        garis("10.4 Multiple Catch");
        DemoMultiCatch.main(args);

        garis("10.5 Throws");
        DemoThrows.main(args);
    }

    private static void garis(String judul) {
        System.out.println("\n===== " + judul + " =====");
    }
}