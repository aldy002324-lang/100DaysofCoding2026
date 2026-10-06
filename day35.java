import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        if (nilai >= 60) {
            if (nilai >= 85) {
                System.out.println("Nilai A");
            } else {
                System.out.println("Lulus");
            }
        } else {
            System.out.println("Tidak lulus");
        }
    }
}
