import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int p, l, hasil;

        System.out.print("Panjang = ");
        p = input.nextInt();

        System.out.print("Lebar = ");
        l = input.nextInt();

        hasil = p * l;

        System.out.println("Hasil luas = " + hasil);
    }
}
