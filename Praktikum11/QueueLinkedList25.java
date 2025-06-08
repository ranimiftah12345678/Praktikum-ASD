public class QueueLinkedList25 {
    TugasNode25 front, rear;
    int size = 0;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(TugasMhs25 mhs) {
        TugasNode25 newNode = new TugasNode25(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else { 
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampil();
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampil();
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            TugasNode25 temp = front;
            System.out.println("Daftar Antrian:");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    public void countQueue() {
        System.out.println("Jumlah antrian: " + size);
    }
}
