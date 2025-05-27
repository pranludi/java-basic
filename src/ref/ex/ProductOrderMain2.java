package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

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
