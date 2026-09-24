import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan lebar");
        int lebar = sc.nextInt();

        System.out.println("masukkan panjang");
        int panjang = sc.nextInt();

        int luas = lebar * panjang;

        System.out.println("hasil luas : " + luas );
    }
}
