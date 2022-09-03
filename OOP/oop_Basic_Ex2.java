public class oop_Basic_Ex2 {
    //인스턴스/필드/메서드 학습 예시//
    public static void main(String[] args) {
        Car car1 = new Car(); //car1 객체 생성
        /*car1 객체 안에는
        1.String 인스턴트 변수 (iv)
        2.static String 클래스 변수 (cv)
        3.void 인스턴트 메서드() (im)
        4.static void 클래스 메서드() (cm)
        이렇게 네개가 생성되어 있음*/
        Car car2 = new Car(); //car2 객체 생성
        /*car2 객체 안에도 car1과 같이
        1.String 인스턴트 변수 (iv)
        2.static String 클래스 변수 (cv)
        3.void 인스턴트 메서드() (im)
        4.static void 클래스 메서드() (cm)
        이렇게 네개가 생성되어 있음*/

        car1.cv = "저는 클래스 변수입니다";
        System.out.println(car1.cv);
        System.out.println(car2.cv);
        System.out.println(Car.cv);
        /*이 단락 쓰기 전에는 원래 밑에 있는 각각의 iv, cv에 할당된 문장인
         "나는 인스턴트 변수", "나는 클래스 변수"가 출력 됐었는데
        이 단락을 쓰니까 클래스 변수의 값 다시 초기화가 되어
        모두 "저는 클래스 변수입니다 "로 바뀜
        (모든 객체가 영향을 받음)*/

        car1.iv = "저는 인스턴스 변수입니다";
        System.out.println(car1.iv);
        System.out.println(car2.iv);
        /*car1 객체에서 iv를 "저는 인스턴스 변수입니다"로 다시 초기화 시킴
         car1의 Car 객체에 있는 iv의 값만 변경
         => car1.iv 만 바뀌어서 출력되고 car2.iv는 영향 받지 않음
         (해당 객체만 영향 받음)*/

    }
}

class Car {
    public String iv = "나는 인스턴트 변수"; //{}괄호가 없으니 필드 (클래스의 속성 나타내는 변수)
    public static String cv = "나는 클래스 변수"; //static 변수(정적 멤버)

    public void im () { //{}괄호가 있으니 메서드 (클래스의 기능 나타내는 함수)
        System.out.println(iv);
        System.out.println(cv);
    }
    public static void cm () { //static 메서드니까 인스턴트 변수인 iv는 들어갈 수 없음
        //System.out.println(iv); //non-static iv cannot be referenced from a static context
        // -> 정적 메소드에서 iv(인스턴트 변수)가 참조될 수 없습니다
        System.out.println(cv);
    }
}