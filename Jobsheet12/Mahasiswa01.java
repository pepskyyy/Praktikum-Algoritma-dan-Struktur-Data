public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    String ipk;

    public Mahasiswa01(String nim, String nm, String kls, String ip) {
        this.nim = nim;
        this.nama = nm;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampil() {
        System.out.println(
            "NIM    : " + nim + "\n" +
            "\nNama   : " + nama + "\n" +
            "\nKelas  : " + kelas + "\n" +
            "\nIPK    : " + ipk
        );
    }

}