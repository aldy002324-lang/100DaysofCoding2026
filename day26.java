import java.util.Scanner;

public class Day26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dua bilangan bulat
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Proses penukaran nilai tanpa variabel tambahan
        a = a + b;
        b = a - b;
        a = a - b;

        // Menampilkan output nilai setelah ditukar
        System.out.println(a);
        System.out.println(b);

        scanner.close();
    }
}
