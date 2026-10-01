import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan angka pertama");
        int a = sc.nextInt();

        System.out.println("masukkan angka kedua");
        int b = sc.nextInt();

        System.out.println("apakah a <= b? " + (a <= b));
        System.out.println("apakah a >= b? " + (a >= b));

        sc.close();
    }
}
