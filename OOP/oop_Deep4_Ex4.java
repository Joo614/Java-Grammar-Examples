public class oop_Deep4_Ex4 {
    // 객체지향 심화 -- 인터페이스 예시 //
    public static void main(String[] args) throws Exception{
        CafeOwner cafeowner = new CafeOwner();
        CafeCustomer cafeCustomerA = new CafeCustomerA(); //인터페이스에 구현 클래스 넣음
        CafeCustomer cafeCustomerB = new CafeCustomerB(); //인터페이스에 구현클래스 넣음

        cafeowner.give(cafeCustomerA); //cafeCustomer.getOrder() 한 거에 A가 들어가서 A가 한 말이 나옴
        cafeowner.give(cafeCustomerB); //cafeCustomer.getOrder() 한 거에 B가 들어가서 B가 한 말이 나옴
    }
}
//    카페를 운영하는 사람이 있습니다.
//    단골손님들은 매일 마시는 음료가 정해져 있습니다.
//    단골손님 A는 항상 아이스 아메리카노를 주문합니다.
//    단골손님 B는 매일 아침 딸기라떼를 구매합니다.

// [ // ] 이 표시한 코드로 실행하면 손님 각각이 어떤 메뉴 주문했는지 알 수 없음
interface CafeCustomer {
   // void customerSay ();
    public abstract String getOrder();
}

class CafeCustomerA implements CafeCustomer {
    //public void customerSay () {
    //    System.out.println("I'll take a glass of iced americano");
    //}
    public String getOrder() {
        return "I'll take a glass of iced americano !!";
    }
}

class CafeCustomerB implements CafeCustomer {
   // public void customerSay() {
   //     System.out.println("I'll take a glass of strawberry latte");
    //}
   public String getOrder() {
       return "I'll take a glass of strawberry latte !!";
   }
}

class CafeOwner {
   // public void give(CafeCustomer customer) {
   //     System.out.println("");
   //}
    public void give(CafeCustomer cafeCustomer) {
        System.out.println("고객이 말하길 : " + cafeCustomer.getOrder());
    }
}
