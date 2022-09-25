public class ExceptionHandling_Ex1 {
    // 예외처리 --- try - catch 문 //
    public static void main(String[] args) {
//        System.out.println("[소문자 알파벳을 대문자로 출력하는 프로그램]");
//        printMyName("abc"); // (1) 대문자로 변환되어 ABC 출력
//        printMyName(null); // (2) 넘겨주는 매개변수가 null 인 경우 NullPointerException 발생 (null 에 점 찍었다 이 말)
//        System.out.println("[프로그램 종료]");
//    }
        try { //밑의 코드를 실행하다가
            System.out.println("[소문자 알파벳을 대문자로 출력하는 프로그램]");
            printMyName(null); // (1) 예외 발생
            printMyName("abc"); // 이 코드는 실행되지 않고 catch 문으로 이동
        }
        catch (ArithmeticException e) { //이 ArithmeticException 예외가 있으면 밑에 코드 실행하고
            // (2) 첫 번째 catch 문 //이 예외가 아니기 때문에 뛰어넘음
            System.out.println("ArithmeticException 발생!");
        }
        catch (NullPointerException e) { //이 NullPointerException 예외가 있으면 밑에 코드 실행해라
            // (3) 두 번째 catch 문 //이 예외이기 때문에 아래의 코드가 출력
            System.out.println("NullPointerException 발생!");
            System.out.println("e.getMessage: " + e.getMessage()); // (4) 예외 정보를 얻는 방법 - 1
            System.out.println("e.toString: " + e.toString()); // (4) 예외 정보를 얻는 방법 - 2
            e.printStackTrace(); // (4) 예외 정보를 얻는 방법 - 3
        }
        finally { // (5) finally문 //예외에 상관없이 항상 실행해라
            System.out.println("[프로그램 종료]");
        }
    }

    static void printMyName(String str) {
        String upperCaseAlphabet = str.toUpperCase();
        System.out.println(upperCaseAlphabet);
    }
}