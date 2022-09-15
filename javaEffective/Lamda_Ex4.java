import java.util.function.Function;

public class Lamda_Ex4 {
    // 람다식 --> 메서드 참조 //
    public static void main(String[] args) {

        //람다식
        Function<String, Integer> example1 = (String str) -> Integer.parseInt(str); //str 이라는 String 타입 변수를 Int 타입으로 변환하겠다

        //메서드 참조 ( 위 람다식을 더 간단하게 줄인 것 )
        Function<String, Integer> example2 = Integer::parseInt;

        System.out.println(example1.apply("1000")); //string 타입이 int 로 변환되어 출력
        System.out.println(example2.apply("2000")); //string 타입이 int 로 변환되어 출력
    }
}
