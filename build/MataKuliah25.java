public class MataKuliah25 {
    public static void main(String[] args) {
        
    }
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah25() {

    }
    public MataKuliah25(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilkanInformasi() {
        System.out.println("KodeMk: " + kodeMk);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("JumlahJam: " + jumlahJam);
    }
    public void ubahSKS(int sksBaru){
        this.sks = sksBaru;
        System.out.println("Masukkan sks baru: " + sksBaru); 
    }
    public void tambahJam(int jam){
        this.jumlahJam += jam;
        System.out.println("jumlah jam: " + jumlahJam + "jam");
    }
    public void kurangiJam(int jam) {
        if (jam > jumlahJam){
            System.out.println("Jumlah jam tidak cukup untuk dikurangi");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam dikurangi: " + jumlahJam + "jam");
        }
    }
}
