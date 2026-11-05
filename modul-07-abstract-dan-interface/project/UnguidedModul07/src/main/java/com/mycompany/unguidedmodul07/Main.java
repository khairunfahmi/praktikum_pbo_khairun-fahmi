package com.mycompany.unguidedmodul07;

public class Main {
    public static void main(String[] args) {
        // 1. Uji Proteksi Abstraksi: Kelas abstrak tidak dapat diinstansiasi secara langsung
        // TiketBioskop ujiAbstrak = new TiketBioskop("Avatar", 50000, 1);

        // 2. Buka Kasir melalui static method antarmuka
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        // 3. Buat Objek Transaksi sesuai parameter soal
        TiketReguler tiket1 = new TiketReguler("Interstellar", 40000.0, 2, 3);
        TiketVIP tiket2 = new TiketVIP("Dune: Part Two", 60000.0, 2, 25000.0);
        PaketSnack snack1 = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000.0);

        // 4. Array Polimorfik Heterogen (Array statis standar)
        ItemTransaksi[] daftarPesanan = new ItemTransaksi[3];
        daftarPesanan[0] = tiket1;
        daftarPesanan[1] = tiket2;
        daftarPesanan[2] = snack1;

        // 5. Pemrosesan Dinamis
        System.out.println("\n=== DAFTAR TRANSAKSI BIOSKOP ===");
        double grandTotal = 0.0;

        for (ItemTransaksi item : daftarPesanan) {
            item.cetakRincianItem(); // Memanggil default method
            grandTotal += item.getNominalBayar(); // Akumulasi total belanja
        }

        // 6. Tutup Kasir
        System.out.println("------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI: Rp" + grandTotal);
        System.out.println("======================================================");
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}