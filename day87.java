import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int data[] = {10, 20, 30, 40, 50};

        System.out.println("Data Awal Array:");

        for (int i = 0; i < data.length; i++) {
            System.out.println("Data ke-" + (i + 1) + " : " + data[i]);
        }

        // Mengubah data
        data[1] = 25;

        // Mengubah data lagi
        data[3] = 45;

        System.out.println("\nData Setelah Dimanipulasi:");

        for (int i = 0; i < data.length; i++) {
            System.out.println("Data ke-" + (i + 1) + " : " + data[i]);
        }

        input.close();
    }
}
    
