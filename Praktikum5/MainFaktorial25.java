import java.util.Scanner;

public class MainFaktorial25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Faktorial25 fk = new Faktorial25();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("Nilai factorial "+nilai+ " menggunakan BF: "+ fk.faktorialBF(nilai));
        System.out.println("Nilai factorial "+nilai+ " menggunakan DC: "+ fk.faktorialDC(nilai));

    }
}
