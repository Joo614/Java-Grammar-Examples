import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionFramework_Ex3 {
    // Set --- HashSet //
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>(); //HashSet 생성

        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Ruby");
        languages.add("Java"); //중복

        //languages 의 반복자(iterator) 생성해서 it에 할당
        Iterator it = languages.iterator();

        //반복자(iterator)를 통해 HashSet 순회하며 각 요소들 출력
        while(it.hasNext()) {
            System.out.println(it.next()); //중복은 생략되고 저장 순서도 유지 안됨
        }
    }
}
