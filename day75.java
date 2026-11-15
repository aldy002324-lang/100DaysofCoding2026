
import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan nama pembanding: ");
        String pembanding = sc.nextLine();

        System.out.print("Masukkan kata yang dicari: ");
        String cari = sc.nextLine();

        // equals()
        System.out.println("Equals: " + nama.equals(pembanding));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + nama.equalsIgnoreCase(pembanding));

        // contains()
        System.out.println("Contains: " + nama.contains(cari));

        // isEmpty()
        System.out.println("Is Empty: " + nama.isEmpty());

        sc.close();
    }
}
