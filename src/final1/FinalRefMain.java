package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // data = new Data(); // 컴파일 오류

        // 참조 대상의 값은 변경 가능
        data.value = 1000;
        System.out.println(data.value);
        data.value = 3000;
        System.out.println(data.value);
    }
}
