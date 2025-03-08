public class MataKuliahMain25 {
    public static void main(String[] args) {
        MataKuliah25 mk1 = new MataKuliah25();

        mk1.kodeMk = "BD";
        mk1.nama = "Basis Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;
        mk1.tampilkanInformasi();

        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(0);
        mk1.tampilkanInformasi();

        MataKuliah25 mk2 = new MataKuliah25("ALSD", "Algoritma Struktur Data", 3, 6);
        mk2.tampilkanInformasi();

        mk2.ubahSKS(2);
        mk2.tambahJam(0);
        mk2.kurangiJam(2);
        mk2.tampilkanInformasi();

    }
}
