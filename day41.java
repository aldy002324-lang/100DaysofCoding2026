import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan suhu ruangan (°C): ");
        double suhu = sc.nextDouble();

        if (suhu < 20) {
            System.out.println("Suhu ruangan dingin");
        } else if (suhu <= 30) {
            System.out.println("Suhu ruangan normal");
        } else {
            System.out.println("Suhu ruangan panas");
        }

        sc.close();
    }
}
