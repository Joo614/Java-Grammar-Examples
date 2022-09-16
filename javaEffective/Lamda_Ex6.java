import java.util.function.BiFunction;
import java.util.function.Function;

public class Lamda_Ex6 {
    // 람다식 --- 생성자 참조 //
    public static void main(String[] args) throws Exception{
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("주현주");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("주현주", "joohyunju");

    }
}
class Member {
    private String name; //private 접근 제어자 필드
    private String id; //private 접근 제어자 필드

    public Member() { //인스턴스 메서드 오버로딩 1
        System.out.println("Member() 실행");
    }

    public Member(String id) { //인스턴스 메서드 오버로딩 2
        System.out.println("Member(String id) 실행");
        this.id = id;
    }

    public Member(String name, String id) { //인스턴스 메서드 오버로딩 3
        System.out.println("Member(String name, String id) 실행");
        this.id = id;
        this.name = name;
    }

    public String getName() { //private 접근 제어자 필드 불러옴
        return name;
    }

    public String getId() { //private 접근 제어자 필드 불러옴
        return id;
    }
}