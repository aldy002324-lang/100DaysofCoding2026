import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = sc.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = sc.nextDouble();

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = a + b;
                break;

            case '-':
                hasil = a - b;
                break;

            case '*':
                hasil = a * b;
                break;

            case '/':
                hasil = a / b;
                break;

            default:
                System.out.println("Operator tidak valid");
                return;
        }

        System.out.println("Hasil = " + hasil);
    }
}
