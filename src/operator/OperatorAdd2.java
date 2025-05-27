package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위(prefix) 증감 연산자
        int a = 1;
        int b = 0;

        b = ++a; // a 의 값을 먼저 증가시키고, 그 결과를 b 에 대입
        System.out.println("a = " + a + " / b = " + b);

        // 후위(postfix) 증감 연산자
        a = 1;
        b = 0;

        b = a++; // a 값을 b에 먼저 대입하고, a 값을 증가
        System.out.println("a = " + a + " / b = " + b);
    }
}
