package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int size = scanner.nextInt();
        System.out.println(size + "개의 정수를 입력하세요:");

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
