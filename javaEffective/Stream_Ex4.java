import java.util.Arrays;

public class Stream_Ex4 {
    // 스트림 --- 최종연산 -- Match(), 기본집계, reduce() //
    public static void main(String[] args) throws Exception{
        //Match() 메서드 //
        int[] intArr = {2,4,6};
        boolean result = Arrays.stream(intArr).allMatch(a -> a%2==0);
        System.out.println("모두 2의 배수인가? -> " + result);

        result = Arrays.stream(intArr).anyMatch(a -> a%3==0);
        System.out.println("3의 배수가 하나라도 있는가? -> " + result);

        result = Arrays.stream(intArr).noneMatch(a -> a%3==0);
        System.out.println("3의 배수가 없는가? -> " + result);

        System.out.println("------------------------------------------------");
        // 집계 메서드들 //

        int[] intArr2 = {1,2,3,4,5};

        long count = Arrays.stream(intArr2).count();
        System.out.println("intArr2의 전체 요소 개수 : " + count);

        long sum = Arrays.stream(intArr2).sum();
        System.out.println("intArr2의 전체 요소 합 : " + sum);

        double avg = Arrays.stream(intArr2).average().getAsDouble();
        System.out.println("intArr2의 전체 요소 평균 : " + avg);

        int max = Arrays.stream(intArr2).max().getAsInt();
        System.out.println("intArr2의 최대값 : " + max);

        int min = Arrays.stream(intArr2).min().getAsInt();
        System.out.println("intArr2의 최소값 : " + min);

        int first = Arrays.stream(intArr2).findFirst().getAsInt();
        System.out.println("intArr2의 첫번째 요소 : " + first);

    }
}
