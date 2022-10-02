import java.util.Stack;

public class Stack_Ex1 {
    // Stack 예시 //
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //Integer형 스택 선언

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        //들어간 순서대로, 1번이 제일 먼저 들어가고 4번이 마지막으로 들어감
        //1 <- 2 <- 3 <- 4

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        //전부 빼내면 마지막 데이터부터 4, 3, 2, 1 순으로 차례로 나옴
    }
}
