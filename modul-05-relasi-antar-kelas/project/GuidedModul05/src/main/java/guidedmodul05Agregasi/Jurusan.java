package guidedmodul05Agregasi;

public class Jurusan {
    private String KodeJurusan, NamaJurusan;
    private Mahasiswa[] Daftar = new Mahasiswa[10];
    private int JmlMhs = 0;
    
    public Jurusan(String kode, String nama) {
        this.KodeJurusan = kode;
        this.NamaJurusan = nama;
    }
    public void AddMahasiswa(Mahasiswa m) {
        this.Daftar[JmlMhs] = m;
        this.JmlMhs++;
    }
    public void DisplayMahasiswa() {
        int i;
        System.out.println("Kode Jurusan : " + this.KodeJurusan);
        System.out.println("Nama Jurusan: " + this.NamaJurusan);
        System.out.println("Daftar Mahasiswa :");
        for(i = 0; i < JmlMhs; i++) {
            System.out.println(Daftar[i].GetNIM() + " " + Daftar[i].GetNama());
        }
    }
    
    // Tambahan method main agar bisa di-run (opsional jika diminta)
    public static void main(String[] args) {
        Jurusan j = new Jurusan("IF", "Informatika");
        Mahasiswa m1 = new Mahasiswa("123", "Budi");
        Mahasiswa m2 = new Mahasiswa("124", "Andi");
        
        j.AddMahasiswa(m1);
        j.AddMahasiswa(m2);
        j.DisplayMahasiswa();
    }
}


