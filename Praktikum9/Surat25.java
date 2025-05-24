public class Surat25 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat25() {}

    public Surat25(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilSurat() {
    System.out.println("ID: " + idSurat + ", Nama: " + namaMahasiswa + ", Kelas: " + kelas + ", Jenis Izin: " + jenisIzin + ", Durasi: " + durasi + " hari");
    }
}
