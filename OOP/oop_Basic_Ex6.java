public class oop_Basic_Ex6 {
    public static void main(String[] args) {
        Person kimcoding = new Person("주현주", "프로그래머", 24);
        Person nahacker = new Person("이해민", "해커", 27, true);

        int age = kimcoding.getAge();
        System.out.println("주현주의 나이는 " + age + "살 입니다.");
    }
}

class Person {
    private String name;
    private String occupation;
    private int age;
    private boolean isSingle;

    Person(){
        System.out.println("첫 번째 생성자");
    };

    Person(String name, String occupation, int age) {
        this(name, occupation, age, false);
        System.out.println("두 번째 생성자");
    }

    Person(String name, String occupation, int age, boolean isSingle) {
        System.out.println("세 번째 생성자");
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.isSingle = isSingle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
