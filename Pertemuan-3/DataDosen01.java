public class DataDosen01 {

    public void dataSemuaDosen(Dosen01[] arrayOfDosen) {
        System.out.println("==============================");
        System.out.println("       DATA SEMUA DOSEN       ");
        System.out.println("==============================");
        for (Dosen01 d : arrayOfDosen) {
            String jk = (d.jenisKelamin) ? "Pria" : "Wanita";
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen01 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen01 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += d.usia;
                jmlWanita++;
            }
        }

        double rataPria = (jmlPria > 0) ? (double) totalUsiaPria / jmlPria : 0;
        double rataWanita = (jmlWanita > 0) ? (double) totalUsiaWanita / jmlWanita : 0;

        System.out.println("Rata-rata Usia Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Wanita : " + rataWanita);
        System.out.println("------------------------------");
    }

    public void infoDosenPalingTua(Dosen01[] arrayOfDosen) {
        Dosen01 tertua = arrayOfDosen[0];
        for (Dosen01 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("Dosen Paling Tua:");
        System.out.println("Nama : " + tertua.nama + " (Usia: " + tertua.usia + ")");
        System.out.println("------------------------------");
    }

    public void infoDosenPalingMuda(Dosen01[] arrayOfDosen) {
        Dosen01 termuda = arrayOfDosen[0];
        for (Dosen01 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("Dosen Paling Muda:");
        System.out.println("Nama : " + termuda.nama + " (Usia: " + termuda.usia + ")");
        System.out.println("------------------------------");
    }
}