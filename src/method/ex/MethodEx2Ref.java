package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(3, message);
        printMessage(5, message);
        printMessage(7, message);
    }

    public static void printMessage(int times, String message) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}