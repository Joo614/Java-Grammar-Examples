import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_Ex2 {
    // 스트림 중간연산 //
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Joo hyunju", "Joo hyunjin", "Kim eunok", "Joo dongpil", "Joo hyunju");

        names.stream()
                .distinct() //중복제거하고
                .forEach(n -> System.out.println(n)); //나머지 요소 출력
        System.out.println("-----------------------");

        names.stream()
                .filter(n -> n.startsWith("Kim")) //Kim 으로 시작하는 요소만 필터링
                .forEach(n -> System.out.println(n)); //나머지 요소 출력
        System.out.println("-----------------------");

        names.stream()
                .distinct() //중복제거하고
                .sorted() //오름차순 정렬
                .filter(n -> n.startsWith("Joo")) //Jpp 로 시작하는 요소만 필터링
                .forEach(n -> System.out.println(n)); //나머지 요소 출력
        System.out.println("-----------------------");

        names.stream()
                .distinct() //중복제거하고
                .sorted(Comparator.reverseOrder()) //내림차순 정렬
                .map(s -> s.toUpperCase()) //모든 요소 대문자로 변경
                .forEach(n -> System.out.println(n)); //나머지 요소 출력
        System.out.println("-----------------------");
    }
}
