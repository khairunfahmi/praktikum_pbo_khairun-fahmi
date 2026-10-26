package guidedmodul06;

public class DemoOver2 {
    public static void main(String[] args) {
        Lagu d, e;
        d = new Lagu();
        e = new Lagu();

        d.IsiParam("Lagu 1");
        e.IsiParam("kepastian yang kutunggu", "GiGi");

        d.CetakKeLayar();
        e.CetakKeLayar();
    }
}