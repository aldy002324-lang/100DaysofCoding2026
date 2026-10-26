public class day55 {
    public static void main(String[] args) {

        // continue
        System.out.println("=== CONTINUE ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // break
        System.out.println("=== BREAK ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // return
        System.out.println("=== RETURN ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                return;
            }
            System.out.print(i + " ");
        }
        
    }
}
