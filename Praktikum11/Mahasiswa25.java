public class Mahasiswa25 {
    String nim; 
    String nama; 
    String kelas; 
    double ipk;

    public Mahasiswa25() {

    }

    public Mahasiswa25(String nim, String nama, String kelas, double ipk) { 
        this.nim = nim; 
        this.nama = nama; 
        this.kelas = kelas; 
        this.ipk = ipk; 
    }

    public void tampilInformasi() { 
        System.out.println(nama + "\t " + nim + "\t " + kelas + "\t" + ipk ); 
    } 
} 