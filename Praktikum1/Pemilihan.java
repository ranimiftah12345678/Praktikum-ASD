import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menghitung Nilai Akhir");
        System.out.println("=============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();
        
        if (uts > 100 || uas > 100 || tugas > 100 || kuis > 100) {
            System.out.println("====================");
            System.out.println("nilai tidak valid");
            System.out.println("====================");
        } else {
            double nilaiAkhir = (tugas * 0.20) + (kuis * 0.20) + (uts * 0.30) + (uas * 0.30);

        String grade;
        if (nilaiAkhir > 80) {
            grade = "A";
        } else if (nilaiAkhir > 73) {
            grade = "B+";
        } else if (nilaiAkhir > 65) {
            grade = "B";
        } else if (nilaiAkhir > 60) {
            grade = "C+";
        } else if (nilaiAkhir > 50) {
            grade = "C";
        } else if (nilaiAkhir > 39) {
            grade = "D";
        } else {
            grade = "E";
        }            
        
        System.out.println("=============================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + grade);
        System.out.println("=============================");
        
        if (nilaiAkhir >= 60) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("Anda Tidak Lulus, Tingkatkan Belajar Anda!");
        }
        
        sc.close();
    }
}
}
