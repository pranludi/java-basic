package final1;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

//    public void changeData(String id, String name) {
//        this.id = id; // 컴파일 오류
//        this.name = name;
//    }

    // 메서드 이름도 변경
    public void changeName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("id : " + id + ", name : " + name);
    }
}
