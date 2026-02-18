import java.util.Scanner;

public class IPSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Matkul = {"Pancasila", "Konsep Teknologi Informasi", "Crital Thinking dan Problem Solving", 
                            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
                            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double[] nilaiAngka = new double[Matkul.length];
        String[] nilaiHuruf = new String[Matkul.length];
        double[] bobotNilai = new double[Matkul.length];
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");
        for (int i = 0; i < Matkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + Matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if(nilaiAngka[i] > 80) { nilaiHuruf[i] = "A"; bobotNilai[i] = 4.0; }
            else if (nilaiAngka[i] > 73) { nilaiHuruf[i] = "B+"; bobotNilai[i] = 3.5; }
            else if (nilaiAngka[i] > 65) { nilaiHuruf[i] = "B"; bobotNilai[i] = 3.0; }
            else if (nilaiAngka[i] > 60) { nilaiHuruf[i] = "C+"; bobotNilai[i] = 2.5; }
            else if (nilaiAngka[i] > 50) { nilaiHuruf[i] = "C"; bobotNilai[i] = 2.0; }
            else if (nilaiAngka[i] > 39) { nilaiHuruf[i] = "D"; bobotNilai[i] = 1.0; }
            else { nilaiHuruf[i] = "E"; bobotNilai[i] = 0.0; }
        }
        
        System.out.println("\nhasil Konversi Nilai");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        double totalBobot = 0;
        int totalSks = 0;
        for(int i = 0; i < Matkul.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", Matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobot += bobotNilai[i] * sks[i];
            totalSks += sks[i];
        }
        System.out.println("================================");
        System.out.printf("IP: %.2f\n", (totalBobot / totalSks));
        sc.close();
    }    
}
