import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        if (nilai >= 85) {
            System.out.println("Nilai A");
        } else if (nilai >= 75) {
            System.out.println("Nilai B");
        } else if (nilai >= 60) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Nilai D");
        }

        sc.close();
    }
}
