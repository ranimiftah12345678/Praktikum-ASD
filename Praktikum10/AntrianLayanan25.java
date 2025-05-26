public class AntrianLayanan25 {
    Mahasiswa25[] data;
    int front, rear, size, max;

    public AntrianLayanan25(int max) {
        this.max = max;
        this.data = new Mahasiswa25[max];
        this.front = 0;
        this.rear =   -1;
        this.size = 0;
    }

    public boolean isEmpty(){
        if(size == 0) {
            return true;
        }else {
            return false;
        }
    } 

    public boolean isFull() {
        if (size == max) {
            return true;
        }else {
            return false;
        }
    } 

    public void tambahAntrian(Mahasiswa25 mhs) {
        if(isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil masuk ke antrian.");
    }

    public Mahasiswa25 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa25 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs; 
    }

    public void lihatTerdepan(){
        if(isEmpty()) {
            System.out.println("Antrian kosong.");
        }else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
    
    public void tampilkanSemua(){
        if(isEmpty()) {
            System.out.println("Antrian kosong.");
        return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for(int i = 0; i < size; i++){
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }
}

