import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Masukkan angka pertama");
        int a = sc.nextInt();

        System.out.println("Masukkan angka kedua");
        int b = sc.nextInt();

        System.out.println("Apakah kedua angka sama? " + (a == b));
        System.out.println("Apakah kedua angka berbeda? " + (a != b));

        sc.close();
    }
}
