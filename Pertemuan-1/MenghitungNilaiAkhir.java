import java.util.Scanner;
public class MenghitungNilaiAkhir {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("==============================");
    System.out.print("Masukkan Nilai Tugas: ");
    double tugas = sc.nextDouble();
    System.out.print("Masukkan Nilai Kuis: ");
    double kuis = sc.nextDouble();
    System.out.print("Masukkan Nilai UTS: ");
    double uts = sc.nextDouble();
    System.out.print("Masukkan Nilai UAS: ");
    double uas = sc.nextDouble();
    System.out.println("==============================");

    if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
        System.out.println("Nilai tidak valid");
    } else {
        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
        String nilaiHuruf;

        if (nilaiAkhir > 80) nilaiHuruf = "A";
        else if (nilaiAkhir > 73) nilaiHuruf = "B+";
        else if (nilaiAkhir > 65) nilaiHuruf = "B";
        else if (nilaiAkhir > 60) nilaiHuruf = "C+";
        else if (nilaiAkhir > 50) nilaiHuruf = "C";
        else if (nilaiAkhir > 39) nilaiHuruf = "D";
        else nilaiHuruf = "E";

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("==============================");
    
        if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            System.out.println("ANDA TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }
    }  
    sc.close();  
}
}