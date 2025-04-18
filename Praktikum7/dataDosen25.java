public class dataDosen25 {
    Dosen25[] dataDosen = new Dosen25[10];
    int idx = 0;

    void tambah(Dosen25 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }else {
            System.out.println(" Data sudah penuh!");
        }
    }
    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }
    void bubbleSort() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen25 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
    void SelectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen25 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen25 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
    }
    int PencarianDataSequential(String nama) {
        int jumlahDitemukan = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Dosen ditemukan pada index ke-" + i);
                dataDosen[i].tampil();
                jumlahDitemukan++;
            }
        }
        if (jumlahDitemukan == 0) {
            System.out.println("Data dosen dengan nama '" + nama + "' tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari 1 data dengan nama tersebut!");
        }
        return jumlahDitemukan;
    }
    int PencarianDataBinary(int usiaCari) {
        bubbleSort();
        int low = 0, high = idx - 1;
        int jumlahDitemukan = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (dataDosen[mid].usia == usiaCari) {
                int kiri = mid, kanan = mid;
                while (kiri - 1 >= 0 && dataDosen[kiri - 1].usia == usiaCari) kiri--;
                while (kanan + 1 < idx && dataDosen[kanan + 1].usia == usiaCari) kanan++;

                for (int i = kiri; i <= kanan; i++) {
                    System.out.println("Dosen ditemukan pada index ke-" + i);
                    dataDosen[i].tampil();
                    jumlahDitemukan++;
                }

                if (jumlahDitemukan > 1) {
                    System.out.println("Peringatan: Ditemukan lebih dari 1 data dengan usia tersebut!");
                }
                return jumlahDitemukan;
            } else if (usiaCari < dataDosen[mid].usia) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Data dosen dengan usia " + usiaCari + " tidak ditemukan.");
        return 0;
    }
}
