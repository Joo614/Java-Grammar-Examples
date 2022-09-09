public class oop_Deep1_Ex4 {
    // 객체지향 심화 -- 상속 -- super / super() 키워드 //
    public static void main(String[] args) {
        Lower l = new Lower();
        l.callNum();

        Student s = new Student();
    }
}

//super 예시
class Upper {
    int count = 20; //super.count //상위 클래스의 객체
}

class Lower extends Upper {
    int count = 15; //this.count //상위 클래스의 생성자 호출

    void callNum() {
        System.out.println("count = " + count);  //15 //이 메서드가 속해있는 클래스의 count 의 값이니까 15
        System.out.println("this.count = " + this.count);  //15 //이 메서드가 속해있는 클래스의 count = this.count 니까 그의 값 15
        System.out.println("super.count = " + super.count);  //20 //하위 클래스에서 상위 클래스의 변수 count 를 호출하니까 20
    }
}

//================================================================================

// super() 예시
class Human { //상위 클래스
    Human() { //void 안붙었으니까 이건 Human 클래스의 생성자
        System.out.println("휴먼 클래스 생성자");
    }
}

class Student extends Human { //상위 클래스를 상속받은 하위 클래스
    Student() { //void 안붙었으니까 이건 Student 클래스의 생성자
        super(); // Human 이라는 상위 클래스의 생성자 호출
        System.out.println("학생 클래스 생성자");
    }
}
