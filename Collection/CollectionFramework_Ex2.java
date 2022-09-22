import java.util.LinkedList;
import java.util.List;

public class CollectionFramework_Ex2 {
    // List<E> --- LinkedList //
    public static void main(String[] args) {

        //Linked List 생성하여 Facelist 에 할당
        List<String> Facelist = new LinkedList<>();

        //String 타입의 데이터를 LinkedList 에 추가
        Facelist.add("eyes");
        Facelist.add("nose");
        Facelist.add("mouth");
        Facelist.add("ears");

        //저장된 총 객체 수 얻기
        int size = Facelist.size();
        System.out.println(size);
        System.out.println("-------------");

        //0번 인덱스의 객체 얻기
        String skill = Facelist.get(0);
        System.out.println(skill);
        System.out.println("-------------");

        //저장된 총 객체 수 만큼 조회
        for (int i = 0; i < Facelist.size(); i++) {
            String str = Facelist.get(i);
            System.out.println(i + " : " + str);
        }
        System.out.println("-------------");

        //for - each 문으로 순회
        for (String str: Facelist) {
            System.out.println(str);
        }
        System.out.println("-------------");

        //0번 인덱스 객체 삭제
        Facelist.remove(0);
        for (String str: Facelist) {
            System.out.println(str);
        }
        System.out.println("-------------");

        //해당 객체 삭제
        Facelist.remove("ears");
        for (String str: Facelist) {
            System.out.println(str);
        }
        System.out.println("-------------");

        //해당 객체 삭제 후 삭제 되었는지 여부 리턴
        System.out.println(Facelist.remove("mouth"));
        for (String str: Facelist) {
            System.out.println(str);
        }
        System.out.println("-------------");

        //리스트 안에 해당 항목이 있는지 판별
        System.out.println(Facelist.contains("eyes")); //아까 삭제해서 없으니까 false
        System.out.println("-------------");

    }
}
