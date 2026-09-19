public class day18 {
    public static void main(String[] args) {

        // byte ke short
        byte dataByte = 10;
        short dataShort = dataByte;

        // short ke int
        short dataShort2 = 20;
        int dataInt = dataShort2;

        // int ke long
        int dataInt2 = 30;
        long dataLong = dataInt2;

        // long ke float
        long dataLong2 = 40;
        float dataFloat = dataLong2;

        // float ke double
        float dataFloat2 = 50.5f;
        double dataDouble = dataFloat2;

        System.out.println("Byte   = " + dataByte);
        System.out.println("Short  = " + dataShort);
        System.out.println("Int    = " + dataInt);
        System.out.println("Long   = " + dataLong);
        System.out.println("Float  = " + dataFloat);
        System.out.println("Double = " + dataDouble);
    }
}
