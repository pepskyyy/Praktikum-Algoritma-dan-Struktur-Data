public class Mahasiswa01 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa01(){
    }

    public Mahasiswa01(String nm, String nim, double ipk,String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    
        void tampilkanInfo(){
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("IPK: " + ipk);
            System.out.println("Kelas: " + kelas);
        }

        void ubahKelas(String kelasBaru){
            kelas = kelasBaru;
        }

        void updateIPK(double ipkBaru){
            ipk = ipkBaru;
        }

        String nilaiKinerja(){
        if (ipk <= 0.0){
            return "Tidak Valid, Harus antara 0.0 dan 4.0";
        } else if (ipk <= 2.0){
            return "Buruk";
        } else if (ipk <= 3.0){
            return "Cukup";
        } else if (ipk <= 3.5){
            return "Baik";
        } else {
            return "Sangat Baik";
        }
        }
    }