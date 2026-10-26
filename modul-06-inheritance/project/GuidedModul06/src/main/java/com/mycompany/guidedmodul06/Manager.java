package guidedmodul06;

public class Manager extends Employee {
    private String alamat;

    public Manager(String nama, String s) {
        /* memanggil konstruktor employee */
        super(nama);
        alamat = s;
    }

    public void tampilAlamat() {
        /* menginisialisasi variabel departemen yang ada pada superclass */
        super.departemen = "Personalia";

        /* memanggil method tampilNama() yang ada pada superclass */
        super.tampilNama();

        /* menampilkan variabel departemen yang telah diinisialisasi */
        System.out.println("alamat : " + alamat);
        System.out.println("departemen : " + super.departemen);
    }

    public static void main(String[] args) {
        /* membuat objek */
        Manager adi = new Manager("adi", "sukabirus");
        adi.tampilAlamat();
    }
}