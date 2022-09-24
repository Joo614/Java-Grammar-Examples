public class Enum_Ex1 {
    // 열거형 사용 //
    public static void main(String[] args) {
//        Seasons seasons = Seasons.SPRING;
//        switch (seasons) { //season 이라는 조건은 사용자 정의 타입이라 불가
//            case Seasons.SPRING:
//                System.out.println("봄");
//                break;
//            case Seasons.SUMMER:
//                System.out.println("여름");
//                break;
//            case Seasons.FALL:
//                System.out.println("가을");
//                break;
//            case Seasons.WINTER:
//                System.out.println("겨울");
//                break;

        Seasons seasons = Seasons.SPRING;
        switch (seasons) { //seasons 라는 타입이 아래 enum 으로 정의되었기 때문에 가능
            case SPRING:
                System.out.println("봄");
                break;
            case SUMMER:
                System.out.println("여름");
                break;
            case FALL:
                System.out.println("가을");
                break;
            case WINTER:
                System.out.println("겨울");
                break;
        }

        System.out.println(Seasons.SPRING); //아래 열거형 enum 으로 선언된 상수에 접근하는 방법 --> 열거형이름.상수명
        Seasons myFav = Seasons.FALL; //myFav 라는 참조변수에 아래 열거형 enum 으로 선언된 Seasons 의 상수 중 Fall을 할당
        System.out.println(myFav); //그리고 myFav 를 출력하면 Fall 이 출력
    }
}
//이렇게 클래스 정의해서 각각 객체로 만들어준 뒤 위에서 switch 문 실행하려고 하면 에러
// --> switch 문의 조건은 char, byte, short, int, Character, Byte, Short, Integer, String, enum 타입만 가능하기 때문
//class Seasons {
//    public static final Seasons SPRING = new Seasons();
//    public static final Seasons SUMMER = new Seasons();
//    public static final Seasons FALL   = new Seasons();
//    public static final Seasons WINTER = new Seasons();
//}

enum Seasons {SPRING, SUMMER, FALL, WINTER} //앞에서부터 정수값 0,1,2,3이 할당되어 있음
