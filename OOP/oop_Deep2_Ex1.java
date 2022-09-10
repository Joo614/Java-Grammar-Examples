public class oop_Deep2_Ex1 {
    // 객체지향 심화 -- 캡슐화 -- getter / setter //
    public static void main(String[] args) {
        //Worker의 객체를 생성하면서
        //객체의 초기값을 바로 생성자에게 넘겨줌
        Worker me = new Worker("주현주", 1999, 6, 14);
        Worker min = new Worker("이해민", 1996, 3, 28);

        me.printWorkerBirth();
        min.printWorkerBirth();

    }
}

class Worker {
    //사람의 이름, 생년월일은 한 번 정해지고 나면 변하지 않기에
    //필드를 private 접근 제어자로 선언
    //Alt + Insert 누르면 생성 가능
    private String name; //변수의 은닉화 //외부로부터 접근 불가
    private int year;
    private int month;
    private int day;

    public String getName() { //getter 메서드 //설정한 변수의 값 읽어오기
        return name;
    }

    public void setName(String name) { //setter 메서드 //읽어온 데이터 값에 조건이 맞을 경우 데이터 값 변경을 가능하게 해줌
        this.name = name;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year < 1) return;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int setMonth(int month) {
        this.month = month;
        return month;
    }

    public int getDay() {
        return day;
    }

    public int setDay(int day) {
        this.day = day;
        return day;
    }

    //getter / setter 만들고 생성자 작성
    //이 때, setter 을 사용하여 데이터 수정해보자
    public Worker(String name, int year, int month, int day) {
        setName(name);
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    //Worker 클래스 안에 생년월일을 출력할 수 있는 메소드도 선언
    //데이터를 불러올 때는 getter 사용하자
    void printWorkerBirth() {
        System.out.println(getName() + "의 생년월일은");
        System.out.println(getYear() + "년 " + getMonth() + "월 " + getDay() + "일 입니다.");
    }
}
