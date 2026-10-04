import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
    
        System.out.println("Masukkan nilai");
        int nilai = a.nextInt();

        if (nilai >= 75) {
            System.out.println("Saya lulus");
        }else{
            System.out.println("Saya Tidak lulus");
        }
        a.close();
    }
}
