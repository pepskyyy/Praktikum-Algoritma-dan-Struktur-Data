public class StackSurat01 {
    Surat01[] stack;
    int size;
    int top;

    StackSurat01(int size) {
        this.size = size;
        stack = new Surat01[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat01 surat) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        } else {
            top++;
            stack[top] = surat;
        }
    }

    public Surat01 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        } else {
            Surat01 surat = stack[top];
            top--;
            return surat;
        }
    }

    public Surat01 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat yang diajukan.");
            return null;
        } else {
            return stack[top];
        }
    }

    public void cari(String nama){
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equals(nama)) {
                stack[i].print();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}
