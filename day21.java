public class day21 {
    public static void main(String[] args) {

        // Membuat data String
        String a = "25";
        String b = "19.8";
        String c = "false";

        // Mengubah String menjadi tipe data int
        int angka = Integer.parseInt(a);

        // Mengubah String menjadi tipe data double
        double nilai = Double.parseDouble(b);

        // Mengubah String menjadi tipe data boolean
        boolean benar = Boolean.parseBoolean(c);

        // Menampilkan hasil konversi String ke int
        System.out.println("String ke int     : " + angka);

        // Menampilkan hasil konversi String ke double
        System.out.println("String ke double  : " + nilai);

        // Menampilkan hasil konversi String ke boolean
        System.out.println("String ke boolean : " + benar);
    }
}
