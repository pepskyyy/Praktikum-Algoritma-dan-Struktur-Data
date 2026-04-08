public class Mahasiswa01 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
    public Mahasiswa01(String nim, String nama, String kelas, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    void cetakInfo() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
}
}