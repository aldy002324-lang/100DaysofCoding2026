import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        int faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Hasil faktorial: " + faktorial);
    }
}
