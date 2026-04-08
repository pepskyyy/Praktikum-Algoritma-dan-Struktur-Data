import java.util.Scanner;

public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen01[] arrayOfDosen = new Dosen01[3];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            String jkInput = sc.nextLine();
            boolean jk = jkInput.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen01(kode, nama, jk, usia);
        }

        // Memanggil method dari DataDosen 
        DataDosen01 dataPengolah = new DataDosen01();
        dataPengolah.dataSemuaDosen(arrayOfDosen);
        dataPengolah.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataPengolah.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataPengolah.infoDosenPalingTua(arrayOfDosen);
        dataPengolah.infoDosenPalingMuda(arrayOfDosen);
    }
}