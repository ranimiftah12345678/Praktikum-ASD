public class SingleLinkedList25 {
        Node25 head; 
        Node25 tail; 
 
    boolean isEmpty() { 
        return (head == null); 
    }     
 
    public void print() { 
        if (!isEmpty()) { 
            Node25 tmp = head; 
            System.out.println("Isi Linked List:"); 
            while (tmp != null) { 
                tmp.data.tampilInformasi(); 
                tmp = tmp.next; 
            } 
            System.out.println(""); 
        } else { 
            System.out.println("Linked List kosong"); 
        } 
    } 
 
    public void addFirst(Mahasiswa25 input) { 
        Node25 ndInput = new Node25(input, null); 
        if (isEmpty()) { 
            head = ndInput; 
            tail = ndInput; 
        }else { 
            ndInput.next = head; 
            head = ndInput; 
        } 
    } 
 
    public void addLast(Mahasiswa25 input ) { 
        Node25 ndInput = new Node25(input, null); 
        if (isEmpty()) { 
            head = ndInput; 
            tail = ndInput; 
        }else { 
            tail.next = ndInput; 
            tail = ndInput; 
        } 
    } 
 
    public void insertAfter(String key, Mahasiswa25 input) { 
        Node25 ndInput = new Node25(input, null); 
        Node25 tmp = head; 
        do { 
            if (tmp.data.nama.equalsIgnoreCase(key)) { 
                ndInput.next = tmp.next; 
                tmp.next = ndInput; 
                if (ndInput.next == null) { 
                    tail = ndInput; 
                } 
                break; 
            } 
            tmp = tmp.next; 
        }while (tmp != null); 
    } 
 
    public void  insertArt(int index, Mahasiswa25 input) { 
        if (index < 0 ) { 
            System.out.println("indeks salah"); 
        } else if (index == 0){ 
            addFirst(input); 
        } else { 
            Node25 tmp = head; 
            for (int i = 0; i < index - 1; i++) { 
                tmp = tmp.next; 
            } 
            tmp.next = new Node25(input, tmp.next); 
            if (tmp.next.next == null) { 
                tail = tmp.next; 
            } 
        } 
    }

    public void getData(int index) {
        Node25 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key){
        Node25 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node25 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak dapat dihapus");
        } else {
            Node25 tmp = head;
            while (tmp != null) {
                if ((tmp.data.nama.equalsIgnoreCase(key)) &&
                    (tmp == head)) {
                    removeFirst();
                    break;
                } else if
                    (tmp.data.nama.equalsIgnoreCase(key)) {
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node25 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if (tmp.next == null) {
                tail = tmp;
            }
        }
    }
}