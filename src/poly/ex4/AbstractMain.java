package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Cow()};
        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }
        for (AbstractAnimal animal : animals) {
            moveAnimal(animal);
        }
    }

    // 동물이 추가 되어도 변경하지 않는 코드
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
