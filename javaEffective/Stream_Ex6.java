import java.sql.Struct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_Ex6 {
    // 스트림 --- collect() //
    public static void main(String[] args) {

        List<Student> totalList = Arrays.asList(
                new Student("김코딩", 10, Student.Gender.Male), //객체들 만듦
                new Student("김인기", 8, Student.Gender.Male),
                new Student("이자바", 9, Student.Gender.Female),
                new Student("최민선", 10, Student.Gender.Female)
        );

        List<Student> maleList = totalList.stream() //위에 만든 객체들 참조변수 maleList 에 넣고
                .filter(s -> s.getGender() == Student.Gender.Male) //그 중에 이것만 골라서
                .collect(Collectors.toList()); //리스트로 만들어라

        maleList.stream().forEach(n -> System.out.println(n.getName())); //위 리스트를 스트림으로 돌면서 이름 추출

        System.out.println("-------");

        Set<Student> femaleList = totalList.stream() //위에 만든 객체들 참조변수 femaleList 에 넣고
                .filter(s -> s.getGender() == Student.Gender.Female) //그 중에 이것만 골라서
                .collect(Collectors.toCollection(HashSet::new)); //해시셋으로 만들어 가져오기

        femaleList.stream().forEach(n -> System.out.println(n.getName())); //위 리스트를 스트림으로 돌면서 이름 추출


    }
}
//Student.java
class Student {
    public enum Gender {Male, Female}

    ; //상수들의 집합
    private String name;
    private int score;
    private Gender gender;

    public Student(String name, int score, Gender gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getScore() {  return score; }
}