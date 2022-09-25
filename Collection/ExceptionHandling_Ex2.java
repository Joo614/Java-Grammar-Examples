public class ExceptionHandling_Ex2 {
    // 예외 전가 //
    public static void main(String[] args) {
        try {
            throwException();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    static void throwException() throws ClassNotFoundException, NullPointerException {
        //throws 키워드를 사용하여 해당 예외를 발생한 메서드 안에서 처리하지 않고 메서드를 호출한 곳으로 다시 떠넘기고 있음
        // -> 예외처리의 책임은 throwException 메서드가 아닌 main 메서드가 지게 됨
        Class.forName("java.lang.StringX");
    }
}
