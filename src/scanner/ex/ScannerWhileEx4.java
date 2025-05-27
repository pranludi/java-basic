package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            if (option == 1) {
                scanner.nextLine(); // 이전에 입력된 개행문자 제거

                System.out.print("상품명을 입력하세요 : ");
                String productName = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int productPrice = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int productQuantity = scanner.nextInt();

                int cost = productPrice * productQuantity;
                System.out.println("상품명:" + productName + " 가격:" + productPrice + " 수량:" + productQuantity + " 합계:" + cost);
                totalPrice += cost;
            } else if (option == 2) {
                System.out.println("총 비용 : " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
