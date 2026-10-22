import java.util.Scanner;
public class day51 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //for menampilkan angka 1 sampai 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");   
        }
        System.out.println();
        //for menampilkan angka 0 dan mines 1 sampai mines 10
        for (int i = 0; i >= -10; i--) {
            System.out.print(i + " ");
        }
        s.close();
    }
}
