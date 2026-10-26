package guidedmodul06;

public class Lingkaran {
    private int jarijari;

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }

    public int getJarijari() {
        return jarijari;
    }

    public int getLuas() {
        return (int) (Math.PI * jarijari * jarijari);
    }

    // OVERLOAD: nama sama, tetapi menerima parameter
    public int getLuas(int jarijari) {
        return (int) (Math.PI * jarijari * jarijari);
    }
}