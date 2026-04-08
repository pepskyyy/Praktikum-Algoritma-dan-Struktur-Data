import java.util.Scanner;
public class mataKuliahdemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mata Kuliah : ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine(); 
        mataKuliah01[] arrayOfMataKuliah = new mataKuliah01[jumlahMataKuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;
        for (int i = 0; i< jumlahMataKuliah; i++){
            System.out.println("Masukkan Data Mata Kuliah ke-"+ (i+1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            arrayOfMataKuliah[i] = new mataKuliah01();
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
            System.out.println("------------------------------------");
        }
        for (int i = 0; i< jumlahMataKuliah; i++){
            System.out.println("Masukkan Data Mata Kuliah ke-"+ (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("------------------------------------");

        }
    }
}
