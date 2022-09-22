import java.util.ArrayList;
import java.util.List;

public class CollectionFramework_Ex1 {
    // List<E> --- ArrayList //
    public static void main(String[] args) {
        List<String> Colorlist = new ArrayList<String>(); //ArrayList 생성하여 Colorlist 에 할당

        //String 타입의 객체들을 ArrayList 에 추가
        Colorlist.add("blue");
        Colorlist.add("pink");
        Colorlist.add("red");
        Colorlist.add("white");

        //저장된 총 객체 수 얻기
        int size = Colorlist.size(); //3개의 객체가 저장되었으니
        System.out.println(size); //3 출력
        System.out.println("-------------");

        //0번 인덱스의 객체 얻기
        String skill = Colorlist.get(0); //0번째 인덱스의 객체를 skill 변수에 저장
        System.out.println(skill); //그걸 출력
        System.out.println("-------------");

        //저장된 총 객체 수만큼 조회
        for (int i = 0; i < Colorlist.size(); i++) { //i가 0부터 객체 수만큼 증가하면서
            String str = Colorlist.get(i); //각 인덱스의 객체를
            System.out.println(i + " : " + str); //출력
        }
        System.out.println("-------------");

        //for-each 문으로 순회
        for(String str: Colorlist) {
            System.out.println(str);
        }
        System.out.println("-------------");

        //0번 인덱스 객체 삭제
        Colorlist.remove(0);
        for(String str: Colorlist) { //삭제 후 무슨 객체들 있는지 확인해보면 0번이었던 blue 가 사라지고 뒤부터 땡겨서 0번 됨
            System.out.println(str);
        }
        System.out.println("-------------");

        //해당하는 객체 삭제
        Colorlist.remove("red");
        for(String str: Colorlist) { //삭제 후 무슨 객체들 있는지 확인해보면 red 라는 객체가 삭제되어 pink, white 만 남음
            System.out.println(str);
        }
        System.out.println("-------------");

        //객체에 해당되는 항목 삭제 후 삭제 되었는지 여부 리턴
        System.out.println(Colorlist.remove("white")); //white 객체 삭제 후 삭제 되었는지 여부 리턴
        for(String str: Colorlist) { //무슨 객체들 있는지 확인해보면 white 객체가 삭제되어 pink 만 남음
            System.out.println(str);
        }
        System.out.println("-------------");

        //리스트 안에 해당 항목이 있는지 판별
        System.out.println(Colorlist.contains("black")); //없으니까 false
        System.out.println("-------------");


    }
}
