import java.util.Scanner;
public class SLLMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList01 sll = new SingleLinkedList01();

        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData mahasiswa ke-" + (i + 1));
            System.out.println("Nama: ");
            String nama = sc.nextLine();
            System.out.println("NIM: ");
            String nim = sc.nextLine();
            System.out.println("Kelas: ");
            String kelas = sc.nextLine();
            System.out.println("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa01 mhs = new Mahasiswa01(nama, nim, kelas, ipk);

            sll.addLast(mhs);
        }
    
        System.out.println("\nHasil Input Linked List : ");
        sll.print();

        sc.close();
    }
}