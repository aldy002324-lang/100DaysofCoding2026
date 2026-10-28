import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        // Mencetak angka ganjil 1 sampai N
        System.out.println("Angka ganjil:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // Mencetak angka genap 1 sampai N
        System.out.println("Angka genap:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
