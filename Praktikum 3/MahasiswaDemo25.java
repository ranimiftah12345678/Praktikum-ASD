public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Mahasiswa25[] arrayofMahasiswa25 = new Mahasiswa25[3];

        arrayofMahasiswa25[0] = new Mahasiswa25();
        arrayofMahasiswa25[0].nim = "2441070";
        arrayofMahasiswa25[0].nama = " AGNES TITANIA KINANTI";
        arrayofMahasiswa25[0].kelas = "TI 1E";
        arrayofMahasiswa25[0].ipk = (float) 3.36;

        arrayofMahasiswa25[1] = new Mahasiswa25();
        arrayofMahasiswa25[1].nim = "2441980";
        arrayofMahasiswa25[1].nama = " AHMAD MAULANA HAMZAH";
        arrayofMahasiswa25[1].kelas = "TI 1E";
        arrayofMahasiswa25[1].ipk = (float) 3.78;

        arrayofMahasiswa25[2] = new Mahasiswa25();
        arrayofMahasiswa25[2].nim = "2441070";
        arrayofMahasiswa25[2].nama = " DIRHAMAWAN PUTRANTO";
        arrayofMahasiswa25[2].kelas = "TI 1E";
        arrayofMahasiswa25[2].ipk = (float) 3.99;

        System.out.println("NIM      : " + arrayofMahasiswa25[0].nim);
        System.out.println("Nama     : " + arrayofMahasiswa25[0].nama);
        System.out.println("kelas    : " + arrayofMahasiswa25[0].kelas);
        System.out.println("IPK      : " + arrayofMahasiswa25[0].ipk);
        System.out.println("_______________________________________");
        System.out.println("NIM      : " + arrayofMahasiswa25[1].nim);
        System.out.println("Nama     : " + arrayofMahasiswa25[1].nama);
        System.out.println("kelas    : " + arrayofMahasiswa25[1].kelas);
        System.out.println("IPK      : " + arrayofMahasiswa25[1].ipk);
        System.out.println("_______________________________________");
        System.out.println("NIM      : " + arrayofMahasiswa25[2].nim);
        System.out.println("Nama     : " + arrayofMahasiswa25[2].nama);
        System.out.println("kelas    : " + arrayofMahasiswa25[2].kelas);
        System.out.println("IPK      : " + arrayofMahasiswa25[2].ipk);
        System.out.println("_______________________________________");

  
    }
}
