import java.util.function.IntBinaryOperator;

public class Lamda_Ex5 {
    // 람다식 --- 메서드 참조 //
    public static void main(String[] args) throws Exception{

        IntBinaryOperator operator;

        operator = Calculator::staticMethod; //클래스 메서드(정적메서드) --> 클래스명 :: 정적메서드명
        System.out.println("정적 메서드 결과 : " + operator.applyAsInt(3,5));

        Calculator calculator = new Calculator(); //객체(인스턴스) 생성

        operator = calculator::instanceMethod; //인스턴스 메서드1 --> 위에 생성한 인스턴스명 :: 인스턴스메서드1명
        System.out.println("인스턴스 메서드1 결과 : " + operator.applyAsInt(3,5));

        operator = calculator::sum; //인스턴스 메서드1 --> 위에 생성한 인스턴스명 :: 인스턴스메서드2명
        System.out.println("인스턴스 메서드2 결과 : " + operator.applyAsInt(3,5));
    }
}
class Calculator {
    public static int staticMethod (int x, int y) { //클래스 메서드
        return x + y;
    }

    public int instanceMethod (int x, int y) { //인스턴스 메서드1
        return x * y;
    }

    public int sum (int num1, int num2) { //인스턴스 메서드2
        return num1 + num2;
    }

}