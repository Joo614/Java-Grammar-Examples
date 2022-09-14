interface FunctionalInterface1 { //매개변수, 리턴값 없는(void) 람다식
    public void accept();
}

interface FuntionalInterface2 { //매개변수 있고, 리턴값 없는(void) 람다식
    public void accept(int x); //추상 메서드 하나
}

interface FunctionalInterface3 { //매개변수 있고, 리턴값이 있는 람다식
    public int accept(int x, int y);
}

public class Lamda_Ex2 {
    // 다양한 람다식 //
    public static void main(String[] args) {

        FunctionalInterface1 ex1;

        ex1 = () -> { //accept() 메서드에 아래의 실행문들을 넣음
          String str = "첫번째 메서드 호출!";
          System.out.println(str);
        };
        ex1.accept(); //위에 넣은 것을 호출

        ex1 = () -> System.out.println("두번째 메서드 호출!"); //실행문이 하나라 {} 생략 가능 //accept() 메서드에 실행문을 넣음
        ex1.accept(); //위에 넣은 것을 호출

        System.out.println("--------------------------------------");

        FuntionalInterface2 ex2;

        ex2 = (x) -> {
            int result = x * 5;
            System.out.println("변수에 넣어서 실행하는 경우 : " + result);
        };
        ex2.accept(2);

        ex2 = (x) -> System.out.println("그냥 바로 식을 넣어 실행하는 경우 : " + x * 5);
        ex2.accept(2);

        System.out.println("--------------------------------------");

        FunctionalInterface3 ex3;

        ex3 = (x,y) -> {
            int result = x + y;
            return result;
        };
        int result1 = ex3.accept(2, 5 );
        System.out.println("하나하나 다 써서 실행 : " + result1);

        ex3 = (x, y) -> { return x + y; };
        int result2 = ex3.accept(2,5);
        System.out.println("리턴문에 바로 식 넣고 실행 : " + result2);

        ex3 = (x, y) ->  x + y;
        // 실행문이 한 줄인 경우, 중괄호 {}와 return문 생략가능
        int result3 = ex3.accept(2, 5);
        System.out.println("리턴문도 없애고 식 실행 : " + result3);

        ex3 = (x, y) -> sum(x, y);
        // 실행문이 한 줄인 경우, 중괄호 {}와 return문 생략가능
        int result4 = ex3.accept(2, 5);
        System.out.println("sum이라는 정적 변수에 실행문 넣고 그것 실행 : " + result4);


    }
    public static int sum(int x, int y) {
        return x + y;
    }
}

