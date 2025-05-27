package method.ex;

import java.util.Scanner;

public class MethodEx4_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;
        while (true) {
            printMenu();
            System.out.print("선택 : ");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    balance = deposit(balance, scanner.nextInt());
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    balance = withdraw(balance, scanner.nextInt());
                    break;
                case 3:
                    System.out.println("현재 잔액 : " + balance + "원");
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴입니다.");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");
    }

    public static int deposit(int balance, int deposit) {
        balance += deposit;
        System.out.println(deposit + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int withdraw) {
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
