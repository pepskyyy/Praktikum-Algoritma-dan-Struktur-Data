package TugasPertemuan12;
import java.util.Scanner;

public class MainAntrian01 {
    public static void main(String[] args) {
        QueueLinkedList01 antrian = new QueueLinkedList01();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n--- Layanan Unit Kemahasiswaan ---");
            System.out.println("1. Tambah Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    System.out.print("IPK: "); double ipk = sc.nextDouble();
                    antrian.enqueue(new Mahasiswa01(nim, nama, kelas, ipk));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.display();
                    break;
                case 6:
                    antrian.clear();
                    break;
            }
        } while (pilih != 7);
    }
}