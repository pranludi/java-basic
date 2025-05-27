package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int orderCount = scanner.nextInt();
        ProductOrder[] productOrders = new ProductOrder[orderCount];

        for (int i = 0; i < orderCount; i++) {
            scanner.nextLine();
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String pName = scanner.nextLine();
            System.out.print("가격: ");
            int pPrice = scanner.nextInt();
            System.out.print("수량: ");
            int pQty = scanner.nextInt();
            productOrders[i] = createOrder(pName, pPrice, pQty);
        }

        // 상품 주문 정보와 최종 금액 출력
        printOrders(productOrders);

        int totalPrice = getTotalAmount(productOrders);
        System.out.println("총 결제 금액 : " + totalPrice);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder productOrder : orders) {
            System.out.println("상품명 : " + productOrder.productName + ", 가격 : " + productOrder.price + ", 수량 : " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder productOrder : orders) {
            totalPrice += productOrder.price * productOrder.quantity;
        }
        return totalPrice;
    }

}
