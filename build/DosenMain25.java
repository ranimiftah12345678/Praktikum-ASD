public class DosenMain25 {
    public static void main(String[] args) {

        Dosen25 Dsn1 = new Dosen25();

        Dsn1.idDosen = "BD001";
        Dsn1.nama = "Safira";
        Dsn1.statusAktif = false;
        Dsn1.tahunBergabung = 2017;
        Dsn1.bidangKeahlian = "Basis Data";

        Dsn1.tampilkanInformasi();
        Dsn1.hitungMasaKerja(2025);
        Dsn1.setStatusAktif(true);
        Dsn1.ubahKeahlian("Data Analisis");

        Dosen25 Dsn2 = new Dosen25("AI002", "Rahmad", true, 2018, "Artificial Intelligence");

        Dsn2.tampilkanInformasi();
        Dsn2.hitungMasaKerja(2025);
    }
}
