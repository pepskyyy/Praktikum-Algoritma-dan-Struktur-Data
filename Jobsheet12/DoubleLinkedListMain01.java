import java.util.Scanner;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DoublelinkedList01 dll = new DoublelinkedList01();
    int pilihan;

    do{
        System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
        System.out.println("1. Tambah Data di Awal");
        System.out.println("2. Tambah Data di Akhir");
        System.out.println("3. Sisipkan Data di tengah (Setelah NIM):");
        System.out.println("4. Tampilkan data");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = sc.nextInt();
        sc.nextLine(); 

        switch (pilihan) {
            case 1:
                Mahasiswa01 mhsAwal = inputMahasiswa(sc);
                dll.addFirst(mhsAwal);
                break;
            case 2:
                Mahasiswa01 mhsAkhir = inputMahasiswa(sc);
                dll.addLast(mhsAkhir);
                break;
            case 3:
                System.out.print("Masukkan NIM yang dicari: ");
                String keyNim = sc.next();
                System.out.println("Masukkan data baru: ");
                Mahasiswa01 mhsBaru = inputMahasiswa(sc);
                dll.inserAfter(keyNim, mhsBaru);
                break;
            case 4:
                dll.print();
                break;
            case 0:
                System.out.println("Program selesai.");
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
    } while (pilihan != 0);
    sc.close();
}
    public static Mahasiswa01 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        String ipk = sc.nextLine();
        sc.nextLine();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
