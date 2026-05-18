import java.util.Scanner;
public class AntrianRoyalDelishMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList01 list = new DoubleLinkedList01();

        list.addLast(new Pembeli01("Ainra", "08224500000", 1));
        list.addLast(new Pembeli01("Danra", "08224511111", 2));
        list.addLast(new Pembeli01("Sanri", "08224522222", 3));

        int counterAntrean = 4;

        int pilihan;

        do{
        System.out.println("==================================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("==================================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesanan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = sc.nextInt();
        sc.nextLine(); // Clear buffer

        switch (pilihan) {
            case 1:
                System.out.print("Nama Pembeli: ");
                String nama = sc.nextLine();
                System.out.print("No HP       : ");
                String noHP = sc.nextLine();

                Pembeli01 pembeliBaru = new Pembeli01(nama, noHP, counterAntrean);
                list.addLast(pembeliBaru); // Pesanan masih null saat menambah antrian

                System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrean);
                counterAntrean++;
                break;
            case 2:
                list.printAntrian();
                break;
            case 3:
                if (list.isEmpty()) {
                    System.out.println("Tidak ada antrian untuk dilayani.");
                    break;
                } 
                System.out.println("Kode Pesanan: ");
                int kode = sc.nextInt();
                sc.nextLine(); // Clear buffer
                System.out.println("Nama Pesanan: ");
                String namaPesanan = sc.nextLine();
                System.out.println("Harga       : ");
                int harga = sc.nextInt();

                Pesanan01 pesananBaru = new Pesanan01(namaPesanan, kode, harga);
                list.layaniAntrian(pesananBaru);
                break;
            case 4:
                list.printLaporanPesanan();
                break;
            case 0:
                System.out.println("Terima kasih telah menggunakan sistem antrian Royal Delish.");
                break;
            default:
                System.out.println("Pilihan tidak valid! Silakan pilih menu 0-4.");
                break;
        }
    }
    while (pilihan != 0);
sc.close();
}
}