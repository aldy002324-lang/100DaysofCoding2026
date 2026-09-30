import java.util.Scanner;
public class day29 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = sc.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = sc.nextDouble();

        System.out.println("Apakah a < b? " + (a < b));
        System.out.println("Apakah a > b? " + (a > b));
        
    }
}
