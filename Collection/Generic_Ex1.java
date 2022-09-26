public class Generic_Ex1 {
    // 제네릭 사용 //
    public static void main(String[] args) {
        Basket<String> basket1 = new Basket<String>("Hello"); //Basket 클래스 내의 T를 String 으로 바꿔 객체 생성
        Basket<Integer> basket2 = new Basket<Integer>(5); //Basket 클래스 내의 T를 Integer 로 바꿔 객체 생성
        Basket<Boolean> basket3 = new Basket<>(true); //Basket 클래스 내의 T를 Boolean 으로 바꿔 객체 생성
        Basket<Double> basket4 = new Basket<>(3.14); //Basket 클래스 내의 T를 Double 로 바꿔 객체 생성
        //< > 안에는 래퍼클래스 활용 ( ex. Int 말고 Integer )
        //우항의 new Basket 뒤 < > 안에는 타입 생략해도 됨 (컴파일러가 유추 가능)
    }

}
class Basket<T> {
    private T item; {
    }

    public Basket(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
