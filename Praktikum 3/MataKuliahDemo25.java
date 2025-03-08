import java.util.Scanner;

public class MataKuliahDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine(); 

        MataKuliah25[] arrayOfMataKuliah = new MataKuliah25[jumlahMataKuliah];
        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));

            arrayOfMataKuliah[i] = new MataKuliah25();
            arrayOfMataKuliah[i].tambahData(sc);
        }

        System.out.println("\n=== Data Mata Kuliah ===");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            if (arrayOfMataKuliah[i] != null) {
                arrayOfMataKuliah[i].cetakInfo();
            }
        }
    }
}
