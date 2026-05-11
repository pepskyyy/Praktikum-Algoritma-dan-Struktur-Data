public class Mahasiswa01 {
    String nim, nama, kelas;
    double ipk;
    
    public Mahasiswa01() {
    }

    public Mahasiswa01(String nm, String nama, String kls, double ip) {
        this.nim = nm;
        this.nama = nama;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampil() {
        System.out.printf("%-12s %12s %-6s %.1f%n", nama, nim, kelas, ipk);
    }
}
