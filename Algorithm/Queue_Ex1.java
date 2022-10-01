import java.util.LinkedList;
import java.util.Queue;

public class Queue_Ex1 {
    // Queue 예시 //
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언

        queue.add(1);     // queue에 값 1 추가
        queue.add(2);     // queue에 값 2 추가
        queue.add(3);     // queue에 값 3 추가
        queue.add(4);     // queue에 값 4 추가
        // 들어간 순서대로, 1번이 제일 먼저 들어가고 4번이 마지막으로 들어감

        System.out.println(queue);

        queue.poll();// queue에 첫번째 값을 반환하고 제거
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        //제일 첫 번째 있는 데이터부터 차례대로 나옴
    }
}
