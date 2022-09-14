public class Lamda_Ex1 {
    // 람다식 --- 익명객체(익명클래스) 생성 //
    public static void main(String[] args) {

        //익명객체 -> 객체의 선언, 생성 동시에
        Object obj = new Object() { //but, Object 타입 참조변수에 담아도 sum 메서드 사용 불가 (Object 클래스에 sum 메서드 없기 때문)
            int sum(int num1, int num2) { // --> 이 익명객체를 컨트롤 할 수 있는 게 함수형 인터페이스
                return num1 + num2;
            }
        };
        //위를 람다식으로
        //Object obj = (num1, num2) -> num1 + num2 로 대체 가능

        Controller controller = (num1, num2) -> num1 + num2;
        // Object controller = (num1, num2) -> num1 + num2;
        // 빨간 줄 뜨는 이유 -> Object controller 에 sum 메서드 없어서

        System.out.println(controller.sum(5,10));
    }
}
interface Controller {
    public abstract int sum(int num1, int num2);//람다식 일회용이라 위의 익명 객체와 1:1로 매칭되기에 하나만 들어가야함
    //위 시그니처의 매개변수는 익명객체 안 매개변수와 같아야함
}