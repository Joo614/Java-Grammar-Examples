public class oop_Deep4_Ex3 {
    // 객체지향 심화 -- 인터페이스 예시 -- 한 클래스가 나머지 클래스를 의존하고 있을 경우 //
    public static void main(String[] args) {
        //User user = new User(); // User 클래스 객체 생성
        //user.callProvider(new Provider()); // Provider 객체 생성 후에 매개변수로 전달

        User user = new User();
//        Provider provider = new Provider(); //1번
//        user.callProvider(new Provider()); //2번
        user.callProvider(new Provider2()); //1번 + 2번 => 객체 생성과 동시에 집어넣을 수 있음
    }
}
//User 클래스가 Provider 클래스에 의존하고 있을 때 Provider 클래스에서 이름을 변경할 경우
//의존하고 있는 User 클래스도 변경해줘야해서 그 수가 많을 때는 복잡
/*class User { // User 클래스 (Provider 클래스에 의존하고 있음)
    public void callProvider(Provider provider) { // Provider 객체를 매개변수로 받는 callProvider 메서드
        provider.call();
    }
}

class Provider { //Provider 클래스
    public void call() {
        System.out.println("무야호~");
    }
}*/

//==> Provider 의 멤버들을 인터페이스로 묶고 Provider 클래스에서 구현한 후, User 클래스에는 인터페이스를 연결하면 훨씬 편리
// 이 경우 Provider 클래스에서 정보 변경할 경우 인터페이스에 의존하는 User 클래스는 자동변환 됨
interface Cover {
    public abstract void call();
}
class User {
    public void callProvider(Cover cover) { // 매개변수의 다형성 활용
        cover.call();
    }
}

class Provider implements Cover {
    public void call() {
        System.out.println("무야호~");
    }
}

class Provider2 implements Cover {
    public void call() {
        System.out.println("야호~");
    }
}