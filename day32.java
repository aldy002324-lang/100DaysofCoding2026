
import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();

        int hasil = a + b;

        System.out.println("Hasil penjumlahan = " + hasil);
        System.out.println("Apakah a lebih besar dari b? " + (a > b));
        System.out.println("Apakah a dan b sama? " + (a == b));
        System.out.println("Apakah a dan b lebih dari 0? " + (a > 0 && b > 0));

        sc.close();
    }
}
