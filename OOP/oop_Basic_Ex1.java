public class oop_Basic_Ex1 {
    //////////// 객체 지향 프로그램 ////////////
    ////////인스턴스/필드/메서드/생성자 학습 예시////////
    public static void main(String[] args) {

        Phone tesla = new Phone("Model 3", "빨강"); //객체 생성 (옆에 생성자로 만든 필드값 동시에 적어줌)

        System.out.println("내 차의 모델은 " + tesla.model + "이고, 색은 " + tesla.color + "입니다." ); //필드 호출
        tesla.power(); //메서드 호출 (System.out.println(); 안하고 이렇게 호출하면 바로 출력 가능)
        tesla.accelerate(); //메서드 호출
        tesla.stop(); //메서드 호출

        // -> model 과 color 의 속성을 가지며, power(), accelerate(), stop() 기능을 가진 Car 클래스 정의함
        // -> first 클래서 안에서 tesla 인스턴스를 만들어서, 밑에 정의한 속성(필드)과 기능(메서드)을 println 메서드를 통해 출력
    }
}
class Phone {
    public String model; //필드 선언
    public  String color; //필드 선언

    public Phone(){} // 기본 생성자 (생성자가 없는 경우 자동 생성됨)

    public Phone(String model, String color) { // 매개변수가 있는 생성자 (생성자 오버로딩)
        this.model = model;
        this.color = color;
    }
    void power() { //메서드 선언
        System.out.println("시동을 걸었습니다.");
    }
    void accelerate() { //메서드 선언
        System.out.println("더 빠르게!!!");
    }
    void stop() { //메서드 선언
        System.out.println("멈춰!!!!!!!");
    }
}