public class Mahasiswa25 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    Mahasiswa25(String nm, String nam, String kls, double ip) {
        nim = nm;
        nama = nam;
        kelas = kls;
        ipk = ip;
    }
    void tampilInformasi(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
        System.out.println("-------------------------------");
    }
}