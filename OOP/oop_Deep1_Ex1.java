public class oop_Deep1_Ex1 {
    public static void main(String[] args) {
        // 객체지향 심화 -- 속성 --> [~~은 ~~이다]의 관계 //
        // 얘는 큰 범위 안에 포함된 각각의 하위 클래스를 트리 구조처럼 가지고 있는 것 //
        Person1 p1 = new Person1(); //상위클래스의 속성, 기능을 가진 객체 생성
        p1.name = "주현주"; //초기화
        p1.age = 24; //초기화
        p1.learn();
        p1.walk();
        p1.eat();
        System.out.println(p1.age + "세 " + p1.name);

        Programmer pg = new Programmer(); //하위클래스의 속성, 기능을 가진 객체 생성
        pg.name = "이해민"; //초기화
        pg.age = 27; //초기화
        pg.companyName = "카카오"; //초기화
        pg.learn(); //Person1 이라는 상위클래스에서 상속받아 사용 가능
        pg.walk(); //Person1 이라는 상위클래스에서 상속받아 사용 가능
        pg.eat(); //Person1 이라는 상위클래스에서 상속받아 사용 가능
        pg.coding(); // Programmer 이라는 하위클래스의 개별 기능
        System.out.println(pg.companyName + "에 다니는 " + pg.age + "세 " + pg.name);
    }
}
class Person1 {
    String name;
    int age;

    void learn() {
        System.out.println("공부를 합니다.");
    };
    void walk() {
        System.out.println("걷습니다.");
    };
    void eat() {
        System.out.println("밥을 먹습니다.");
    };
}

class Programmer extends Person1 { // Programmer 라는 하위 클래스가 extends 키워드 사용해서 Person 이라는 상위 클래스로부터 상속받음!!
    String companyName; //이것부터 밑에는 하위클래스에서만 추가할 필드와 메서드

    void coding() {
        System.out.println("코딩을 합니다.");
    }
} //class 끝

class Dancer extends Person1 { // Dancer 라는 하위 클래스가 extends 키워드 사용해서 Person 이라는 상위 클래스로부터 상속받음!!
    String groupName;

    void dancing() {
        System.out.println("춤을 춥니다.");
    }
} //class 끝

class Singer extends Person1 { // Singer 라는 하위 클래스가 extends 키워드 사용해서 Person 이라는 상위 클래스로부터 상속받음!!
    String bandName;

    void singing() {
        System.out.println("노래를 부릅니다.");
    }

    void playGuitar() {
        System.out.println("기타를 연주합니다.");
    }
} //class 끝