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
}
