import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Ex1 {
    // 스트림 생성//
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c"); //옆에 요소들을 리스트로 만들어주는 것

        //기존에는 iterator 나 for 문 사용해서 했었는데

        //Stream 생성하여 가능
        // list.stream() 에 커서 두고 ctrl + alt + v 누르면 생성문이 자동 완성
        Stream<String> listStream = list.stream(); //Collection 의 List 로부터 Stream 생성
        listStream.forEach(System.out::println); //스트림의 모든 요소들을 출력

        //배열로부터 Stream 생성
        Stream<String> stream1 = Stream.of("a", "b", "c"); //가변 인자 //String 을 요소로 하는 Stream 만듦
        Stream<String> stream2 = Stream.of(new String[] { "a", "b", "c" }); //가변 인자 //String 배열도
        Stream<String> stream3 = Arrays.stream(new String[] { "a", "b", "c" }); //가변 인자 //int 를 요소로 가지는 배열 -> 숫자와 관련된 스트림은

        Stream<String> stream4 = Arrays.stream(new String[] { "a", "b", "c" },0, 3); //end 범위 미포함

        int[] intArr = {1,2,3,4,5,6};
        IntStream stream5 = Arrays.stream(intArr); //숫자와 관련된 건 인트스트림 쓰자
        stream5.forEach(System.out::println);

    }
}
