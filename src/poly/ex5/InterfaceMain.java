package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceAnimal[] animals = {new Dog(), new Cat(), new Cow()};
        for (InterfaceAnimal animal : animals) {
            soundAnimal(animal);
        }
        for (InterfaceAnimal animal : animals) {
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
