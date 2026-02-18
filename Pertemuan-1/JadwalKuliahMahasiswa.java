import java.util.Scanner;
public class JadwalKuliahMahasiswa {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah kuliah (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String [n][4];

        inputData(jadwal);

        int pilihan;
        do {
            System.out.println("\n--- Menu Jadwal Kuliah ---");
            System.out.println("1. Tampilkan jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(jadwal);
                    break;
                case 2:
                    tampilkanJadwalByHari(jadwal);
                    break;
                case 3:
                    tampilkanJadwalByMataKuliah(jadwal);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }
    static void inputData(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++){
            System.out.println("\nInput data jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam: ");
            jadwal[i][3] = sc.nextLine();
        }
    }
    static void tampilkanSeluruhJadwal(String[][] jadwal){
        System.out.printf("\n%-25s | %-15s | %-10s | %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-25s | %-15s | %-10s | %-15s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }
    static void tampilkanJadwalByHari(String[][] jadwal){
        System.out.print("Masukkan hari yang dicari: ");
        String hari = sc.nextLine();
        boolean ditemukan = false;

        System.out.printf("\nJadwal Kuliah pada Hari %s\n", hari);
        for (int i = 0; i < jadwal.length; i++) {
                if (jadwal[i][2].equalsIgnoreCase(hari)) {
                    System.out.printf("- %-25s (%s) Jam %s\n", jadwal[i][0], jadwal[i][1], jadwal[i][3]);
                    ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari tersebut.");
    }
}
    static void tampilkanJadwalByMataKuliah(String[][] jadwal){
        System.out.print("Masukkan nama mata kuliah yang dicari: ");
        String mataKuliah = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++){
            if (jadwal[i][0].equalsIgnoreCase(mataKuliah)) {
                System.out.println("\nInformasi Jadwal:");
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);
                ditemukan = true;
        }
    }
    if (!ditemukan) {
        System.out.println("Mata kuliah tidak ditemukan dalam jadwal.");
    }
}
        }      