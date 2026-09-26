import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan jari_jari lingkaran");
        double s = sc.nextDouble();

        double luas = Math.PI * s * s;

        System.out.printf("Luas lingkaran jari_jari %.2f adalah : %.2f ", s , luas);

    }
}
