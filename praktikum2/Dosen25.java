public class Dosen25 {
    public static void main(String[] args) {

    }
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen25() {
       
    }
    
    public Dosen25(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilkanInformasi() {
        System.out.println("===== Informasi Dosen =====");
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("statusAktif: " + statusAktif);
        System.out.println("tahunBergabung: " + tahunBergabung);
        System.out.println("bidangKeahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status dosen telah diperbarui menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }
    
    void hitungMasaKerja(int thnSkrng) {
        int masaKerja = thnSkrng - tahunBergabung;
        System.out.println("Masa kerja dosen: " + masaKerja + " tahun.");
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diperbarui menjadi: " + bidangKeahlian);
    }
     
}
