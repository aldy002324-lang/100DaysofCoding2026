import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (y > x) {
            x = x + 1;
        }else if (y < x) {
            x = x - 1;
        }
        if (z > x) {
            x = x +=2;
        }else if (z < x) {
            x = x -=2;
        }
        System.out.println(x);
        sc.close();
    }
}
