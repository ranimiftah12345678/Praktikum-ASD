import java.util.Scanner;
public class MahasiswaDemo25 {
    public static void main(String[] args) {
        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("_____________________________________");
            list.tambah(new Mahasiswa25(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("-----------------------------------------");
        System.out.println("pencarian data");
        System.out.println("-----------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: "); 
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("-----------------------------------------");
        System.out.println("menggunakan sequential searching");
        System.out.println("-----------------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss); 
        System.out.println("-----------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-----------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs -1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
