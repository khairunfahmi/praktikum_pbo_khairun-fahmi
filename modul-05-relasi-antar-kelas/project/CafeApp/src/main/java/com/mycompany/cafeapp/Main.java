package com.mycompany.cafeapp;

public class Main {
    public static void main(String[] args) {
        // 1. Buat Kasir
        Kasir kasir = new Kasir("Budi");

        // 2. Buat 3 ItemPesanan secara independen
        ItemPesanan item1 = new ItemPesanan("Iced Americano", 18000);
        ItemPesanan item2 = new ItemPesanan("Beef Croissant", 25000);
        ItemPesanan item3 = new ItemPesanan("Matcha Latte", 22000);

        // 3. Buat Pesanan untuk Meja 4 (kapasitas 5 item)
        Pesanan pesanan = new Pesanan(4, 5);

        // 4. Masukkan item ke pesanan (Agregasi)
        pesanan.tambahItem(item1);
        pesanan.tambahItem(item2);
        pesanan.tambahItem(item3);

        // 5. Tampilkan pesanan
        pesanan.tampilkanPesanan();

        // 6. Proses pembayaran (Asosiasi)
        kasir.prosesPembayaran(pesanan);
    }
}
