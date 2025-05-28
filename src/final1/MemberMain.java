package final1;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "name");
        member.print();

//        member.changeData("myId2", "name_change");
        member.changeName("name_change");
        member.print();
    }
}
