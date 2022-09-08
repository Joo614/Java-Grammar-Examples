public class oop_Deep1_Ex2 {
    // 객체지향 심화 ----- 속성 중에 포함 ------> [~~는 ~~를 가지고 있다]의 관계 //
    // 얘는 더 큰 범위의 클래스가 작은 범위의 클래스를 가지고 있는 거 //
    public static void main(String[] args) {
        Address address1 = new Address("서울", "한국");
        Address address2 = new Address("도코", "일본");

        Employee e1 = new Employee(1, "김코딩", address1);
        Employee e2 = new Employee(2, "박해커", address2);

        e1.showInfo();
        e2.showInfo();
    }
}
class Employee { //근로자 정보 클래스 //Employee 클래스 안에 참조변수를 선언하여 Address 클래스와의 중복을 없애고 포함관계로 재사용
    int id;
    String name;
    Address address; //이 안에 밑의 Address 클래스 재사용해서 포함함

    public Employee(int id, String name, Address address) { //이 안에 밑의 Address 클래스 재사용해서 포함함
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.country);
    }
}

class Address { //주소 클래스 //원래는 얘네를 Employee 클래스의 변수로 정의 해주어야 하는데 따로 생성해서 Employee 클래스 안에 참조변수를 선언하여 포함관계로 재사용
    String city, country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}
