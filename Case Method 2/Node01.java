public class Node01{
    Pembeli01 dataPembeli;
    Pesanan01 dataPesanan;
    Node01 next;
    Node01 prev;

    public Node01(Pembeli01 dataPembeli, Pesanan01 dataPesanan) {
        this.dataPembeli = dataPembeli;
        this.dataPesanan = dataPesanan;
        this.next = null;
        this.prev = null;
    }
}