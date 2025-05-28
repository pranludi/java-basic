package poly.ex.pay2;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("결제 수단을 입력하세요 : ");
            String payOption = scanner.nextLine();
            if ("exit".equals(payOption)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("결제 금액을 입력하세요 : ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);
        }
    }
}