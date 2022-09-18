import java.util.Arrays;

public class Stream_Ex5 {
    // 스트림 --- reduce() //
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        long sum = Arrays.stream(intArr).sum();
        System.out.println("intArr의 전체 요소 합 " + sum);

        int sum1 = Arrays.stream(intArr)
                .map(el -> el*2) //각 요소들 *2
                .reduce((a,b) -> a+b)
                .getAsInt();
        System.out.println("초기값 없는 reduce " + sum1);

        int sum2= Arrays.stream(intArr)
                .map(el -> el*2)
                .reduce(0, (a,b) -> a+b); // 디폴트 값 0
        System.out.println("초기값 존재하는 reduce " + sum2);
    }
}