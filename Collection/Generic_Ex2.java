public class Generic_Ex2 {
    // 제네릭 다형성 사용 //
    public static void main(String[] args) {
        Basket3<Flower> flowerBasket = new Basket3<>();
        //참조변수 flowerBasket 에 저장된 Basket3 객체 넣고 item 의 타입을 Flower 로 지정

//        Rose rose = new Rose();
//        flowerBasket.setItem(rose);
        flowerBasket.setItem(new Rose()); // 다형성 적용
        //Rose 타입의 Rose 객체는 Flower 클래스를 상속받고 있으므로 이는 Flower 타입이기도 함

        //flowerBasket.setItem(new RosePasta()); // 에러
        //RosePasta 타입이고 RosePasta 클래스는 Flower 클래스와 아무런 관계 X
        //--> flowerBasket 의 item 에 할당 불가

    }
}
class Flower {
    public int i; //그냥 적은 예시
}
class Rose extends Flower {
    public String a; //그냥 적은 예시
}
class RosePasta {
    public Double d; //그냥 적은 예시
}

class Basket3<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
