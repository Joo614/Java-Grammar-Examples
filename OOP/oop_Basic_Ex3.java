public class oop_Basic_Ex3 {
    // 생성자 예시 //
    public static void main(String[] args) {
        Book c = new Book("Model X", "빨간색", 250); //객체 생성과 동시에 인스턴스의 필드값 바로 설정
        System.out.println("제 차는 " + c.getModelName() + "이고, 컬러는 " +  c.getColor() + "입니다.");
    }
}

class Book {
    private String modelName;
    private String color;
    private int maxSpeed;

    public Book(String modelName, String color, int maxSpeed) { //매개 변수가 있는 생성자 //위에 값을 일일이 쓸 필요 없이 객체 생성과 동시에 초기화 가능
        this.modelName = modelName; //Book 클래스의 생성자를 호출하는 것 (같은 클래스 내에 있는 다른 생성자 호출할 때 this.() 사용)
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }
}