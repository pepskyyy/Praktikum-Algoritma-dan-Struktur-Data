public class BinaryTreeArray01 {
    Mahasiswa01[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray01() {
        this.dataMahasiswa = new Mahasiswa01[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa01 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}