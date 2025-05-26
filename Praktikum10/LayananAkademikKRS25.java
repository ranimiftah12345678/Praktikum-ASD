import java.util.Scanner;

public class LayananAkademikKRS25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS25 antrian = new AntrianKRS25(10);
        int pilih;

        do {
            System.out.println("\n===== MENU ANTRIAN KRS =====");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Proses (2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 1 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Jumlah Antrian Saat Ini");
            System.out.println("7. Jumlah Mahasiswa yang Sudah KRS");
            System.out.println("8. Jumlah Mahasiswa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa25 mhs = new Mahasiswa25(nim, nama, prodi, kelas);
                    antrian.tambahAntrian25(mhs);
                    break;

                case 2:
                    Mahasiswa25[] dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        for (Mahasiswa25 m : dilayani) {
                            if (m != null) {
                                System.out.print("Melayani mahasiswa: ");
                                m.tampilkanData();
                            }
                        }
                    }
                    break;

                case 3:
                    antrian.tampilkanSemua25();
                    break;

                case 4:
                    antrian.lihatTerdepan25();
                    break;

                case 5:
                    antrian.lihatAkhir25();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.jumlahProses();
                    break;

                case 8:
                    System.out.println("Jumlah mahasiswa belum KRS: " + (10 - antrian.size));
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
