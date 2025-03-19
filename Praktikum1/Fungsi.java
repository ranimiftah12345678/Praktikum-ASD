import java.util.Scanner;

public class Fungsi {
    static Scanner sc = new Scanner(System.in);
    static int HargaAglonema = 75000;
    static int HargaKeladi = 50000;
    static int HargaAlocasia = 60000;
    static int HargaMawar = 10000;

    static int[][] stockBunga = {{10, 5, 15}, {7, 6, 11}, {12, 2, 10}, {5, 5, 7}};
    static int[] stockMawar = {15, 9, 10, 12}; 

    public static void main(String[] args) {
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual: ");
        printPendapatan();
        System.out.println("\nJumlah stok setiap jenis bunga pada cabang RoyalGarden: ");
        printStock();
    }

    public static void printPendapatan() {
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        
        for (int i = 0; i < cabang.length; i++) {
            int pendapatan = (stockBunga[i][0] * HargaAglonema) + 
                             (stockBunga[i][1] * HargaKeladi) + 
                             (stockBunga[i][2] * HargaAlocasia) + 
                             (stockMawar[i] * HargaMawar);
            System.out.printf("%s: Rp. %,d\n", cabang[i], pendapatan);
        }
    }

    public static void printStock() {
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] totalStock = new int[jenisBunga.length];

        for (int i = 0; i < stockBunga.length; i++) {
            totalStock[0] += stockBunga[i][0]; 
            totalStock[1] += stockBunga[i][1]; 
            totalStock[2] += stockBunga[i][2]; 
            totalStock[3] += stockMawar[i];     
        }

        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.printf("%s: %d\n", jenisBunga[i], totalStock[i]);
        }
        sc.close();
    }
}