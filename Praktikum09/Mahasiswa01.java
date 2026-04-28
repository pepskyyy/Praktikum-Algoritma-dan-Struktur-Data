public class Mahasiswa01{
    String nama;
    String nim;
    String kelas;
    int nilai;


public Mahasiswa01(String nama, String nim, String kelas) {
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
    nilai = -1;
}

public void dinilai(int nilai) {
    this.nilai = nilai;
}
}