import java.util.Scanner;

public class DosenDemo25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Masukkan jumlah dosen :");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen25[] arrayOfDosen25 = new Dosen25[jumlahDosen];


        for (int i=0; i <jumlahDosen; i++) {
            System.out.println("\nMasukkan nama dosen ke-" + (i+1));

            System.out.print("kode      : ");
            String kode = sc.nextLine();

            System.out.print("nama      : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true untuk Laki-laki, false untuk Perempuan): ");
            boolean jenisKelamin = sc.nextBoolean();
            
            System.out.print("usia      : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen25[i] = new Dosen25(kode, nama, jenisKelamin, usia);
        }
        
        System.out.println("\n====== DATA DOSEN ======");
        for (Dosen25 dosen : arrayOfDosen25) {
            dosen.tampilkanInfo();
    }
}
}
