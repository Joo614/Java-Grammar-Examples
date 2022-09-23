import java.util.TreeSet;

public class CollectionFramework_Ex4 {
    // Set --- TreeSet //
    public static void main(String[] args) {

        TreeSet<String> workers = new TreeSet<>(); // TreeSet 생성

        // TreeSet 에 요소 추가
        workers.add("Lee Java");
        workers.add("Park Hacker");
        workers.add("Kim Coding");

        System.out.println(workers);
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("Lee"));
        System.out.println(workers.subSet("Kim", "Park"));
    }
}
class Node {
    Object element; // 객체의 주소값을 저장하는 참조변수 입니다.
    Node left;      // 왼쪽 자식 노드의 주소값을 저장하는 참조변수입니다.
    Node right;     // 오른쪽 자식 노드의 주소값을 저장하는 참조변수입니다.
}