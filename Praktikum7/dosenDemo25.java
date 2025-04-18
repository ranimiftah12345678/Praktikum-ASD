import java.util.Scanner;

public class dosenDemo25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dataDosen25 data = new dataDosen25();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Muda ke Tua)");
            System.out.println("4. Sorting DSC (Usia Tua ke Muda)");
            System.out.println("5. Sorting DSC (Insertion Sort)");
            System.out.println("6. Pencarian Nama Dosen (Sequential Search)");
            System.out.println("7. Pencarian Usia Dosen (Binary Search)");
            System.out.println("8. Keluar");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan kode: ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan jenis kelamin (true untuk Laki-laki, false untuk Perempuan): ");
                    boolean jk = input.nextBoolean();
                    System.out.print("Masukkan usia: ");
                    int usia = input.nextInt();
                    data.tambah(new Dosen25(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.bubbleSort();
                    System.out.println("-----------------------------------");
                    System.out.println("Data dosen setelah sorting (ASC).\n");
                    data.tampil();
                    break;
                case 4:
                    data.SelectionSort();
                    System.out.println("-----------------------------------");
                    System.out.println("Data dosen setelah sorting (DSC - Selection Sort).\n");
                    data.tampil();
                    break;
                case 5:
                    data.insertionSort();
                    System.out.println("-----------------------------------");
                    System.out.println("Data dosen setelah sorting (DSC - Insertion Sort).\n");
                    data.tampil();
                    break;
                case 6:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cariNama = input.nextLine();
                    data.PencarianDataSequential(cariNama);
                    break;
                case 7:
                    System.out.print("Masukkan usia yang dicari: ");
                    int cariUsia = input.nextInt();
                    data.PencarianDataBinary(cariUsia);
                    break;
                case 8:
                    System.out.println("Keluar dari program.");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
