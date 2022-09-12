public class oop_Deep4_Ex2 {
    // 객체지향 심화 -- 인터페이스 구현 / 추상클래스 상속과 인터페이스 다중구현 //
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();

        dog.cry();
        dog.play();
        cat.cry2();
        cat.play();
    }
}
interface Animal2 { // 인터페이스 선언. public abstract 생략 가능.
    public abstract void cry();
}
abstract class Animal3 {
    public abstract void cry2();
}

interface Pet2 {
    void play();
}

class Dog2 implements Animal2, Pet2 { // Animal2와 Pet2 인터페이스 다중 구현
    public void cry(){ // 메서드 오버라이딩
        System.out.println("멍멍!");
    }

    public void play(){ // 메서드 오버라이딩
        System.out.println("원반 던지기");
    }
}

class Cat2 extends Animal3 implements Pet2 { // 추상클래스 Animal3 상속과 Pet2 인터페이스 다중 구현

    public void cry2() {
        System.out.println("미야옹~!");
    }
    public void play() {
        System.out.println("쥐 잡기");
    }
}
