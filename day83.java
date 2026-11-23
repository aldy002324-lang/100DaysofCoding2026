import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data : ");
        int jumlah = input.nextInt();

        int data[] = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + " : ");
            data[i] = input.nextInt();

            total += data[i];
        }

        System.out.println("Jumlah seluruh elemen : " + total);
    }
}
