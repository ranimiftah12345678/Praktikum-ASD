public class Dosen25 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen25(String kd, String name, boolean jk, int usi) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = usi;
    }
    void tampil() {
        System.out.println("kode: " + kode + ", nama: " + nama + ", jenis kelamin: " + (jenisKelamin ? "laki laki" : "perempuan") + ", usia: " + usia);
    }
}
