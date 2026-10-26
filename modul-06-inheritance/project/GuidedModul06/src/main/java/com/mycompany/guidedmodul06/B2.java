package guidedmodul06;

public class B2 extends A2 {
    @Override
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar(); // method milik superclass dipanggil
        System.out.println("Method milik class B dipanggil...");
    }
}