public class oop_Basic_Ex4 {
    // 생성자 this() 예시 //
    public static void main(String[] args) {
        Example example = new Example();
        Example example2 = new Example(5);
    }
}

class Example  {
    public Example() { //(1) 매개변수 없는 생성자
        System.out.println("Example 의 기본 생성자 호출!");
    };

    public Example(int x) { //(2) 매개변수 있는 생성자
        this(); //먼저 this() 메서드가 출력되어 (1)번 생성자가 출력된 후 밑에 출력
        System.out.println("Example 의 두 번째 생성자 호출!");
    }
}
