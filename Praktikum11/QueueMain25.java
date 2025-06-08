import java.util.Scanner;

public class QueueMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList25 queue = new QueueLinkedList25();

        while (true) {
            System.out.println("\n==== Menu Antrian Layanan ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    queue.enqueue(new TugasMhs25(nama, nim));
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    queue.printQueue();
                    break;
                case 6:
                    queue.countQueue();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }
    }
}
