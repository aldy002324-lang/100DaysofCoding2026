import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();

        int jumlah = 0;

        for (int i = 1; i <= N; i++) {
            jumlah += i;
        }
        System.out.println("hasil penjumlahan : " + jumlah);

        sc.close();
    }
}
