import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tinggi garis: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

        sc.close();
    }
}
