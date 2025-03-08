public class Mahasiswa25 {

    public static void main(String[] args) {
       
    }
        String nama;
        String nim;
        String Kelas;
        double ipk;

    public Mahasiswa25(){

    }    
    public Mahasiswa25 (String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.Kelas = kelas;
        this.ipk = ipk;
    }
    
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + Kelas);
    }
    
    public void ubahKelas (String kelasBaru) {
        Kelas = kelasBaru;
    }
    public void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui: " + this.ipk);
           } else {
            System.out.println("IPK tidak valid.");
           }
    }
    public String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "kinerja baik";
        } else if (ipk >= 2.0) {
            return "kinerja cukup";
        } else {
            return "kinerja kurang";
        }
    }
}
