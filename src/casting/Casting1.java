package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        double doubleValue2 = 100L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue2);
    }
}
