import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");  
        int jmlMatakuliah = sc.nextInt();
        sc.nextLine();

        String[] mataKuliah = new String[jmlMatakuliah];
        int[] sks = new int[jmlMatakuliah];
        int[] semester = new int[jmlMatakuliah];
        String[] hariKuliah = new String[jmlMatakuliah];

        for (int i = 0; i < jmlMatakuliah; i++) {
            System.out.println("Mata kuliah " + (i + 1) + ":");
            System.out.print("Nama mata kuliah: ");
            mataKuliah[i] = sc.nextLine();

            System.out.print("SKS: ");
            sks[i] = sc.nextInt();

            System.out.print("Semester: ");
            semester[i] = sc.nextInt();

            System.out.print("Hari Kuliah: ");
            sc.nextLine();
            hariKuliah[i] = sc.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Mencari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    tampilkanJadwal(mataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(mataKuliah, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(mataKuliah, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String namaDicari = sc.nextLine();
                    cariMataKuliah(mataKuliah, sks, semester, hariKuliah, namaDicari);
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 5);

        sc.close();
    }


    public static void tampilkanJadwal(String[] mataKuliah, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah:");
        System.out.printf("%-30s %-5s %-10s %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-30s %-5d %-10d %-10s%n", mataKuliah[i], sks[i], semester[i], hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] mataKuliah, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah Hari " + hari + ":");
        System.out.printf("%-30s %-5s %-10s %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        boolean found = false;
        for (int i = 0; i < hariKuliah.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.printf("%-30s %-5d %-10d %-10s%n", mataKuliah[i], sks[i], semester[i], hariKuliah[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari + ".");
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] mataKuliah, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah Semester " + sem + ":");
        System.out.printf("%-30s %-5s %-10s %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        boolean found = false;
        for (int i = 0; i < semester.length; i++) {
            if (semester[i] == sem) {
                System.out.printf("%-30s %-5d %-10d %-10s%n", mataKuliah[i], sks[i], semester[i], hariKuliah[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + sem + ".");
        }
    }


    public static void cariMataKuliah(String[] mataKuliah, int[] sks, int[] semester, String[] hariKuliah, String namaDicari) {
        boolean found = false;
        for (int i = 0; i < mataKuliah.length; i++) {
            if (mataKuliah[i].equalsIgnoreCase(namaDicari)) {
                System.out.printf("Mata Kuliah Ditemukan: %s, SKS: %d, Semester: %d, Hari: %s%n", 
                mataKuliah[i], sks[i], semester[i], hariKuliah[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah dengan nama " + namaDicari + " tidak ditemukan.");
        }
    }
}