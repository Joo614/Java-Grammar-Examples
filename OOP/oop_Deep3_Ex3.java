public class oop_Deep3_Ex3 {
    //객체지향 심화 -- 다형성 //
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new CaffeLatte());

        System.out.println("현재 잔액은 " + customer.money + "원 입니다.");
    }
}
class Coffee { //상위 클래스
    int price;

    public Coffee(int price) {
        this.price = price;
    }
}
class Americano extends Coffee { //하위 클래스 1-1
    public Americano() {
        super(4000); //상위 클래스 Coffee 의 생성자를 호출하여 가격을 변경
    }
    public String toString() { //Object 클래스 toString() 메서드 오버라이딩
        return "아메리카노";
    }
};
class CaffeLatte extends Coffee { //하위 클래스 1-2
    public CaffeLatte() {
        super(5000); //상위 클래스 Coffee 의 생성자를 호출하여 가격을 변경
    }
    public String toString() { //Object 클래스 toString() 메서드 오버라이딩
        return "카페라떼";
    }
};
class Customer {
    int money = 50000;

    void buyCoffee (Coffee coffee) { //상위 클래스 Coffee 를 상속받은 하위 클래스의 경우 밑에 조건에 모두 해당됨
        if (money < coffee.price) { //커피의 가격보다 돈이 없는 경우
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price; //내 돈 = 가진 돈 - 커피 가격
        System.out.println(coffee + "를 구입했습니다.");
    }

    /*void buyCoffee (Americano americano) { //아메리카노 구입
        money = money - americano.price;
    }

    void buyCoffee (CaffeLatte caffeLatte) { //카페라떼 구입
        money = money - caffeLatte.price;
    }

    위 두 메서드를

    void buyCoffee (Coffee coffee) {
        money = money - coffee.price;
    }

    로 변경 가능
    두 하위 클래스의 메서드가 같을 경우, 하위 클래스를 각각 쓰지 않고 상위 클래스로 한번 쓰면
    그 상위 클래스에 속한 하위 클래스들이 그 메서드 안에 모두 해당됨*/
}
