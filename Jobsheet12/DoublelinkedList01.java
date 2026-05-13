import org.w3c.dom.Node;

public class DoublelinkedList01 {
    Node01 head;
    Node01 tail;

    public DoublelinkedList01() {
        head = null;
        tail = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) { 
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void inserAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
        System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
        return;
    }

    Node01 newNode = new Node01(data);

    if(current == tail) {
        newNode.prev = current;
        current.next = newNode;
        tail = newNode;
    } else {
        newNode.prev = current;
        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;
    }
    System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        } 

        Node01 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
            }
        }

    public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong.");
        return;
    }
    Node01 current = tail;
    while (current != null) {
        current.data.tampil();
        current = current.prev;
    }
}
}