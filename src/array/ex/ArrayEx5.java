package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println(size + "개의 정수를 입력하세요:");

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += scanner.nextInt();
        }
        System.out.println("입력한 정수의 합계 : " + total);
        double average = (double) total / numbers.length;
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
