import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        System.out.println("Angka ganjil : ");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Angka genap : ");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        sc.close();
    }
}
