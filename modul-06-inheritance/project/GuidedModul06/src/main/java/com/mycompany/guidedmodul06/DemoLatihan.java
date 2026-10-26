package guidedmodul06;

public class DemoLatihan {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJarijari(7);
        System.out.println("=== Lingkaran ===");
        System.out.println("Jari-jari       : " + lingkaran.getJarijari());
        System.out.println("Luas            : " + lingkaran.getLuas());
        System.out.println("Luas (jari 10)  : " + lingkaran.getLuas(10));

        Bola bola = new Bola(7);
        System.out.println("=== Bola ===");
        System.out.println("Jari-jari       : " + bola.getJarijari());
        System.out.println("Luas permukaan  : " + bola.getLuas());
        System.out.println("Volume          : " + bola.getVolume());
    }
}