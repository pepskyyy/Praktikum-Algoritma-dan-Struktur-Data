package TugasPertemuan12;
public class QueueLinkedList01 {
    Node01 head, tail;
    int size;

    public QueueLinkedList01() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Menambahkan antrian (Enqueue / addLast)
    public void enqueue(Mahasiswa01 mhs) {
        Node01 newNode = new Node01(mhs);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    // Memanggil antrian (Dequeue / removeFirst)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memanggil antrian: " + head.data.nama);
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan: ");
            head.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian Paling Akhir: ");
            tail.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node01 temp = head;
        System.out.println("Daftar Antrian Saat Ini:");
        while (temp != null) {
            temp.data.tampilData();
            temp = temp.next;
        }
        System.out.println("Total mahasiswa mengantre: " + size);
    }
}