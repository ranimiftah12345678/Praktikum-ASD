public class AntrianKRS25 {
    Mahasiswa25[] data;
    int front, rear, size, max;
    int totalDiproses;

    public AntrianKRS25(int max) {
        this.max = max;
        this.data = new Mahasiswa25[max];
        this.front = rear = -1;
        this.size = 0;
        this.totalDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian25(Mahasiswa25 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa25[] layaniMahasiswa() {
        System.out.println("Memproses 2 Mahasiswa: ");
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
            return null;
        }

        Mahasiswa25[] mhsDipanggil = new Mahasiswa25[2];
        for (int i = 0; i < 2; i++) {
            if (size > 0) {
                mhsDipanggil[i] = data[front];
                front = (front + 1) % max;
                size--;
                totalDiproses++;
            } else {
                mhsDipanggil[i] = null;
            }
        }
        return mhsDipanggil;
    }

    public void tampilkanSemua25() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatTerdepan25() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void lihatAkhir25() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir dalam antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void jumlahProses() {
        System.out.println("Jumlah mahasiswa sudah proses KRS: " + totalDiproses);
    }
}