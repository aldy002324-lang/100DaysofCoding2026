import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data : ");
        int jumlah = input.nextInt();

        int data[] = new int[jumlah];

        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan data ke-" + (i+1) + " : ");
            data[i] = input.nextInt();
        }

        System.out.println("Isi array adalah : ");
        for(int i = 0; i < jumlah; i++){
            System.out.println(data[i]);
        }
    }
}
