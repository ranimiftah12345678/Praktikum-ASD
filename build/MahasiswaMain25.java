public class MahasiswaMain25 {
    public static void main(String[] args) {

        Mahasiswa25 mhs1 = new Mahasiswa25();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa25 mhs2 = new Mahasiswa25("Annisa nabila", "2441720160", "TI 2L", 3.25);
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa25 rani = new Mahasiswa25("Rani Miftah", "244107020057", "TI 1E", 3.50);
        rani.updateIPK(3.56);
        rani.tampilkanInformasi();  
    }
}
