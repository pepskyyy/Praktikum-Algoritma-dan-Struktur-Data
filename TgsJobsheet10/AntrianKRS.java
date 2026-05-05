public class AntrianKRS {
    Mahasiswa01[] data;
    int front, rear, size, max;
    int sudahKRS = 0;
    int totalKapasitasDPA = 30;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa01[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa01 mhs) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil mendaftar antrean.");
        } else {
            System.out.println("Antrean penuh!");
        }
    }

    public void panggilAntrian() {
        if (size >= 2) {
            for (int i = 0; i < 2; i++) {
                Mahasiswa01 m = data[front];
                System.out.println("Memproses KRS: " + m.nama);
                front = (front + 1) % max;
                size--;
                sudahKRS++;
            }
        } else if (size == 1) {
            System.out.println("Hanya ada 1 mahasiswa. Memproses: " + data[front].nama);
            front = (front + 1) % max;
            size--;
            sudahKRS++;
        } else {
            System.out.println("Antrean kosong.");
        }
    }

    public void tampilkanSemua() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        } else {
            System.out.println("Antrean kosong.");
        }
    }

    public void lihatDuaTerdepan() {
        if (size >= 2) {
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        } else if (size == 1) {
            data[front].tampilkanData();
        } else {
            System.out.println("Antrean kosong.");
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrean kosong.");
        }
    }

    public void cetakLaporan() {
        System.out.println("Jumlah antrean saat ini: " + size);
        System.out.println("Mahasiswa sudah KRS: " + sudahKRS);
        System.out.println("Sisa kuota DPA (belum KRS): " + (totalKapasitasDPA - sudahKRS));
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrean berhasil dikosongkan.");
    }
}