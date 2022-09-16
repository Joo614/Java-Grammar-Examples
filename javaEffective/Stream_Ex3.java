import java.util.Arrays;
import java.util.stream.Stream;

public class Stream_Ex3 {
    // Map / faltMap //
    public static void main(String[] args) {
        Stream<String[]> stringArraysStream = Stream.of(
                new String[]{"hello", "world", "java"}, //각각의 객체들을 만들어줌
                new String[]{"code", "states"});

        stringArraysStream.flatMap(Arrays::stream).forEach(System.out::println);
    }
}
