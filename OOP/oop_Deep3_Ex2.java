public class oop_Deep3_Ex2 {
    // 객체지향 심화 -- 다형성 -- instanceof (캐스팅 가능 여부 확인) --> 해당 클래스가 자기 집이 맞는지 확인//
    //참조변수 + instanceof + 타입 --> 앞에 있는 참조변수가 참조하고 있는 인스턴스가 어떤 클래스인지 구분해주는 역할
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a instanceof Object); //a 가 Object 의 인스턴스 인가? //true
        // a 이라는 참조변수가 참조하고 있는 Animal 인스턴스 타입이 Object 최상위 클래스에 속하기 때문에 true
        System.out.println(a instanceof Animal); //a 가 Animal 의 인스턴스 인가? //true
        // 자신의 인스턴스 타입이므로 가능
        System.out.println(a instanceof Bat); //a 가 Bat 의 인스턴스 인가? //false
        // a 이라는 참조변수가 참조하고 있는 Animal 인스턴스 타입이 Bat 라는 하위클래스 인스턴스에 속하지 않기 때문에 서로 타입이 달라 false

        Animal b = new Cat(); //Cat 이라는 객체를 Animal 이라는 객체 타입의 b 참조변수로 지정한다
        System.out.println(b instanceof Object); //b 가 Object 의 인스턴스 인가? //true
        // b 참조변수가 참조하고 있는 Animal 인스턴스 타입이 Object 최상위 클래스에 속하기 때문에  true
        System.out.println(b instanceof Animal); //b 가 Animal 의 인스턴스 인가? //true
        // 자신의 인스턴스 타입이므로 가능
        System.out.println(b instanceof Cat); //b 가 Cat 의 인스턴스 인가? //true
        // 앞에서 Cat 이라는 객체를 Animal 타입의 참조변수 b로 지정했기 때문에 상위클래스 인스턴스로 취급되는 Cat 객체에서는 상위 클래스인 Animal 클래스에서 상속받은 멤버만 접근 가능이므로
        // b 참조변수가 참조하고 있는 Animal 타입 취급을 받는 Cat 인스턴스 타입이  자기자신에  포함 true

        //1. Animal b = new Cat(); 2. Cat b = new Cat();
        //참조변수 b가 모두 같은 Cat 객체를 포함하고 있음 -> 여기서 다른 점이라하면
        //1번은 Cat 객체를 상위클래스 타입으로 취급하였기 때문에 Cat 이 가지고 있는 모든 메서드 사용 불가
        // -> 상위 클래스 / 하위 클래스가 있으면 여기서 하위클래스는 상위클래스에서 상속받은 속성/기능 + 자신만의 속성/기능 을 가지고 있기 때문에
        // 상위클래스로 취급하는 경우 원래 있던 자신의 속성/기능은 쓰지 못하고 상위클래스에서 상속받은 속성/기능만 사용 가능
        //2번은 둘이 같은 객체이기 때문에 상속받은 속성/기능과 자기 자신의 속성/기능 모두 사용 가능

        System.out.println(b instanceof Bat); //b 가 Bat 의 인스턴스 인가? //false
        // 상속관계가 아니므로 b 참조변수가 Bat 이라는 객체 타입에 속하지 않아 false

    }
}

class Animal {}; //상위 클래스 1
class Bat extends Animal {}; //하위 클래스 1-1
class Cat extends Animal {}; //하위 클래스 1-2