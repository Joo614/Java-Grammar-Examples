public class Enum_Ex2 {
    // 열거형 메서드 사용 //
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        Level[] allLevels = Level.values(); //Level 에 정의된 모든 상수를 배열로 반환
        for(Level l : allLevels) {
            System.out.printf("%s=%d%n", l.name(), l.ordinal()); //객체 이름 = 객체 순번(0부터) 이렇게 출력하라
        }

        Level findLevel = Level.valueOf("LOW"); //참조변수 findLevel 에 LOW 라는 문자열의 열거 객체를 지정
        System.out.println(findLevel); //LOW 출력
        System.out.println(Level.LOW == Level.valueOf("LOW"));
        //위애서 반환한 findLevel 의 값인 Level.valueOf("LOW") 이것이 의도했던 Level.LOW 의 값과 같은지 boolean 값으로 확인

        switch(level) {
            case LOW:
                System.out.println("낮은 레벨");
                break;
            case MEDIUM:
                System.out.println("중간 레벨");
                break;
            case HIGH:
                System.out.println("높은 레벨");
                break;
        }
    }
}
enum Level {LOW, MEDIUM, HIGH}