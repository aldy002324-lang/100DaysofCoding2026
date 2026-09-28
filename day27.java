import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka");
        int angka = sc.nextInt();

        System.out.println("Nilai awal = " + angka );

        angka++;
        System.out.println("Setelah increment = " + angka);

        angka--;
        System.out.println("Setelah decrement = " + angka);

        sc.close();
    }
}
