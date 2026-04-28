import java.util.Scanner;
public class SuratDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat01 stack = new StackSurat01(10);
        
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah Surat");
            System.out.println("2. Hapus Surat");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (C/S): ");
                    char jenisIzin = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    
                    Surat01 suratBaru = new Surat01(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat berhasil ditambahkan.");
                    break;
                case 2:
                    Surat01 suratDihapus = stack.pop();
                    if (suratDihapus != null) {
                        System.out.println("Surat dengan ID " + suratDihapus.idSurat + " telah dihapus.");
                    }
                    break;
                case 3:
                    Surat01 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat terakhir yang diajukan:");
                        suratTerakhir.print();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa untuk mencari surat: ");
                    String namaCari = sc.nextLine();
                    stack.cari(namaCari);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (true);
    }
}
