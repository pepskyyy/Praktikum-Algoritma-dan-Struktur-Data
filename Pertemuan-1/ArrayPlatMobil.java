import java.util.Scanner;

public class ArrayPlatMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kode = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String[] kota = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA",
                        "MALANG", "TEGAL"};
    System.out.print("Masukkan kode plat mobil (A, B, D, E, F, G, H, L, N, T): ");
    String input = sc.nextLine();
    boolean found = false;
    for (int i = 0; i < kode.length; i++) {
        if (kode[i].equals(input)) {
            System.out.println("Kode plat mobil " + input + " berasal dari kota " + kota[i]);
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Kode plat mobil tidak ditemukan.");
    } sc.close();
}
}