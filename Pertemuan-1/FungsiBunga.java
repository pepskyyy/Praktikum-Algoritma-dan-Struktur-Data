public class FungsiBunga {
    static int [][] stock = {
        {10, 5, 15, 7},
        {11, 6, 9, 12},
        {10, 2, 10, 5},
        {5, 7, 12, 9},
    };
    static int[] harga = {75000, 50000, 60000, 10000};
    
    public static void main(String[] args) {
        tampilkanPendapatan();
    }

    static void tampilkanPendapatan() {
        for (int i = 0; i < stock.length; i ++) {
            int pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            String status = (pendapatan > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";
            System.out.println("RoyalGarden " + (i + 1) + ": Rp" + pendapatan + " (" + status + ")");
        }
    }
}
