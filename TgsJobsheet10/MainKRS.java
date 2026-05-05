import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS krs = new AntrianKRS(10); // Maksimal antrean 10
        int pilih;

        do {
            System.out.println("\n--- Sistem Antrean KRS ---");
            System.out.println("1. Tambah Antrean");
            System.out.println("2. Panggil Antrean (2 Orang)");
            System.out.println("3. Lihat Semua Antrean");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Antrean Terakhir");
            System.out.println("6. Laporan Statistik");
            System.out.println("7. Kosongkan Antrean");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    krs.tambahAntrian(new Mahasiswa01(nim, nama, prodi, kelas));
                    break;
                case 2: krs.panggilAntrian(); break;
                case 3: krs.tampilkanSemua(); break;
                case 4: krs.lihatDuaTerdepan(); break;
                case 5: krs.lihatAkhir(); break;
                case 6: krs.cetakLaporan(); break;
                case 7: krs.clear(); break;
            }
        } while (pilih != 0);
    sc.close();
    }
}    