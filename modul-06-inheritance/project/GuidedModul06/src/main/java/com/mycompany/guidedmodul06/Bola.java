package guidedmodul06;

public class Bola extends Lingkaran {
    private int jarijari;

    public Bola(int jarijari) {
        this.jarijari = jarijari;
        super.setJarijari(jarijari); // atribut private di superclass diisi lewat setter
    }

    // OVERRIDE: luas lingkaran diganti menjadi luas permukaan bola
    @Override
    public int getLuas() {
        return (int) (4 * Math.PI * getJarijari() * getJarijari());
    }

    public int getVolume() {
        return (int) (4.0 / 3 * Math.PI * Math.pow(getJarijari(), 3));
    }
}