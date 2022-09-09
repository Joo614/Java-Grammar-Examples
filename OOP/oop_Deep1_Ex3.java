public class oop_Deep1_Ex3 {
    // 객체지향 심화 -- 상속 -- 메서드 오버라이딩 //
    public static void main(String[] args) {
        Bike bike = new Bike(); //하위클래스의 속성, 기능을 가진 클래스들을 각각의 타입으로 객체 생성
        CarCar car = new CarCar();
        MotorBike motorBike = new MotorBike();

        bike.run(); //각각의 타입으로 선언
        car.run();
        motorBike.run();

        Vehicle bike2 = new Vehicle(); //상위클래스 타입으로 객체 생성
        Vehicle car2 = new Vehicle();
        Vehicle motorbike2 = new Vehicle();

        bike2.run(); //상위클래스 타입으로 선언
        car2.run();
        motorbike2.run();

        /* 배열로 한번에 관리하기
         * Vehicle[] vehicles = new Vehicle[] { new Bike(), new Car(), new MotorBike()}; //Vehicle 이라는 상위클래스 배열 안에 하위 클래스들을 요소로 넣음
         * for (Vehicle vehicle : vehicles) {
         *   vehicle.run();
         * }
         * */
    }
}

class Vehicle { //Vehicle 이라는 상위클래스
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle { //Vehicle 이라는 상위클래스를 상속받은 Bike 라는 하위 클래스
    void run() { //상속받은 상위 클래스의 메소드를 오버라이딩 하여 자신에 맞게 변경함
        System.out.println("Bike is running");
    }
}

class CarCar extends Vehicle { //Vehicle 이라는 상위클래스를 상속받은 Car 라는 하위 클래스
    void run() { //상속받은 상위 클래스의 메소드를 오버라이딩 하여 자신에 맞게 변경함
        System.out.println("Car is running");
    }
}

class MotorBike extends Vehicle { //Vehicle 이라는 상위클래스를 상속받은 Motorbike 라는 하위 클래스
    void run() { //상속받은 상위 클래스의 메소드를 오버라이딩 하여 자신에 맞게 변경함
        System.out.println("MotorBike is running");
    }
}
