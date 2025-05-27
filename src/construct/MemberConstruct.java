package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 : " + name + ", " + age + ", " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50);
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }
}
