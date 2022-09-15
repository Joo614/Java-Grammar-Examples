@FunctionalInterface
interface Example {
    void shout(); //public abstract 생략
}
public class Lamda_Ex3 {
    // 람다식 -- 함수형 인터페이스의 사용 //
    public static void main(String[] args) {

        Example normalExample = new Example() { //익명 클래스로 shout 메서드 구현
            @Override //애너테이션
            public void shout() {
                System.out.println("익명클래스로 shout 메서드 구현");
            }
        };

        Example lamdaExamaple = () -> System.out.println("람다식으로 shout 메서드 구현"); //위에 익명객체 생성하고 한 걸 람다식으로 바꾼 것

        Example example = getAction(); //반환타입이 Example 인 메서드

        normalExample.shout();
        lamdaExamaple.shout();
        example.shout();

        act(lamdaExamaple); //매개변수 타입이 Example 인 메서드
        act(() -> System.out.println("act 메서드로 호출한 람다식"));

    }
    //Lamda_Ex3 클래스 안의 메서드 1
    static Example getAction() {
        Example example = () -> System.out.println("반환타입이 Example 인 메서드"); //example 이라는 참조변수에 람다식을 넣어줌 (람다식의 메서드 명은 shout )
        return example; //람다식을 그대로 리턴 ( 람다가 객체이기 때문에 람다식을 이런식으로 반환 가능 )
    }

    //Lamda_Ex3 클래스 안의 메서드 1
    static void act (Example example) { // 매개변수 타입이 Example 인 메서드 -> 위의 람다 함수 자체를 매개변수로 전달 ( 객체이기 때문에 가능 )
        example.shout();
    }
}
