public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;

    public DoubleLinkedList01() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pembeli01 dataPembeli) {
        Node01 newNode = new Node01(dataPembeli, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP" );

        Node01 current = head;
        boolean adaAntrian = false;
        while (current != null) {
            // Hanya cetak pembeli yang belum melakukan pemesanan (pesanan masih null)
            if (current.dataPesanan == null) {
                System.out.printf("%-12s %-15s %-15s\n", 
                    current.dataPembeli.noAntrean, 
                    current.dataPembeli.namaPembeli, 
                    current.dataPembeli.NoHp);
                adaAntrian = true;
            }
            current = current.next;
        }
        if (!adaAntrian) {
            System.out.println("Semua antrian sudah selesai dilayani.");
        }
    }

    public void layaniAntrian(Pesanan01 pesananBaru) {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian untuk dilayani.");
            return;
        }

        // Cari node terdepan yang belum mengisi pesanan
        Node01 current = head;
        while (current != null && current.dataPesanan != null) {
            current = current.next;
        }

        if (current != null) {
            // Masukkan data pesanan ke pembeli tersebut
            current.dataPesanan = pesananBaru;
            System.out.println(current.dataPembeli.namaPembeli + " telah memesan " + pesananBaru.namaPesanan);
        } else {
            System.out.println("Semua antrian sudah memesan makanan.");
        }
    }

    public void printLaporanPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada data transaksi pesanan.");
            return;
        }

        // Lakukan sorting manual (Bubble Sort) sebelum data dicetak
        sortingManualBerdasarkanNamaPesanan();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        Node01 current = head;
        int totalPendapatan = 0;
        while (current != null) {
            // Hanya cetak data yang sudah sukses memesan makanan
            if (current.dataPesanan != null) {
                System.out.printf("%-15d %-20s %-10d\n", 
                    current.dataPesanan.kodePesanan, 
                    current.dataPesanan.namaPesanan, 
                    current.dataPesanan.harga);
                totalPendapatan += current.dataPesanan.harga;
            }
            current = current.next;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }

    // Logika sorting manual menggunakan Bubble Sort 
    private void sortingManualBerdasarkanNamaPesanan() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node01 current = head;

            while (current.next != null) {
                if (current.dataPesanan != null && current.next.dataPesanan != null) {
                    if (current.dataPesanan.namaPesanan.compareToIgnoreCase(current.next.dataPesanan.namaPesanan) > 0) {
                        // Tukar data pembeli
                        Pembeli01 tempPembeli = current.dataPembeli;
                        current.dataPembeli = current.next.dataPembeli;
                        current.next.dataPembeli = tempPembeli;

                        // Tukar data pesanan
                        Pesanan01 tempPesanan = current.dataPesanan;
                        current.dataPesanan = current.next.dataPesanan;
                        current.next.dataPesanan = tempPesanan;

                        swapped = true;
                    }
                }
                current = current.next;
            }
        } while (swapped);
    }
}