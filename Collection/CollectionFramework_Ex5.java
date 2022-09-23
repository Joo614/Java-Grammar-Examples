import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionFramework_Ex5 {
    // Map --- HashMap
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>(); // HashMap 생성

        // Entry 객체 저장
        map.put("피카츄", 85); //key 값, value 값
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 65);
        map.put("피존투", 15);

        // 저장된 총 Entry 수 얻기
        System.out.println("총 entry 수: " + map.size());
        System.out.println("-------------");

        // 객체 찾기
        System.out.println("파이리 : " + map.get("파이리")); //파이리의 값을 불러와라
        System.out.println("-------------");

        // key 를 요소로 가지는 Set 을 생성 -> 아래에서 순회하기 위해 필요합니다.
        Set<String> keySet = map.keySet(); //set 에서 iterator() 호출해서 그걸로 순회하려고

        // keySet 을 순회하면서 value 를 읽어옵니다.
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) { //다음 객체 있으면
            String key = keyIterator.next(); //키 가져와
            Integer value = map.get(key); // 키를 읽어와서 값 가져와
            System.out.println(key + " : " + value); // 위에서 읽어온 키 : 값 출력
        }
        System.out.println("-------------");

        // 객체 삭제
        map.remove("피존투");
        System.out.println("총 entry 수: " + map.size());
        System.out.println("-------------");

        // Entry 객체를 요소로 가지는 Set을 생성 -> 아래에서 순회하기 위해 필요합니다.
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //Map 인터페이스 안의 Entry 인터페이스

        // entrySet 을 순회하면서 value 를 읽어옵니다.
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) { //다음 객체가 있으면
            Map.Entry<String, Integer> entry = entryIterator.next(); //가져와
            String key = entry.getKey(); // Map.Entry 인터페이스의 키 가져와
            Integer value = entry.getValue(); // Map.Entry 인터페이스의 각 키 값에 대항하는 값 가져와
            System.out.println(key + " : " + value); //위에서 읽어온 키 : 값 출력
        }
        System.out.println("-------------");

        // 객체 전체 삭제
        map.clear();
        System.out.println(map); // 모두 삭제해서 없음
    }
}
