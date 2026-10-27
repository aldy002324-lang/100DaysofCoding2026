import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        // Mencetak angka 1 sampai N
        System.out.println("Angka 1 sampai N:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Mencetak angka N sampai 1
        System.out.println("Angka N sampai 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
