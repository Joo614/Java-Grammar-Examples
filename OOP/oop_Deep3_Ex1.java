public class oop_Deep3_Ex1 {
    // 객체지향 심화 -- 다형성 / 다형성 -- 타입변환 //
    public static void main(String[] args) {
        Friend friend = new Friend(); // 객체 타입과 참조변수 타입의 일치
        BoyFriend boyFriend = new BoyFriend();
        Friend girlfriend = new GirlFriend(); // 객체 타입과 참조변수 타입의 불일치
        //class 를 GirlFriend 로 설정했으니 타입도 GirlFriend 로 설정해야 하는데
        //하위 클래스인 GirlFriend 객체를 상위 클래스의 Friend 타입의 참조변수로 지정해줌 (업캐스팅)
        //이럴 경우 girlFriend 라는 참조변수가 상위 클래스의 멤버를 사용 가능
        //GirlFriend 객체를 Friend 타입으로 업캐스팅하는 이 경우, GirlFriend 객체가 Friend 타입의 객체로 취급되어 GirlFriend 클래스의 필드, 메서드는 접근할 수 없게 됨
        //==> 참조변수가 사용할 수 있는 멤버의 개수는 상위 클래스의 멤버의 수가 됨 (업캐스팅 해서 해당 객체의 취급이 상위 클래스로 바뀌었기 때문에 위 설명과 같음)

        //GirlFriend friend1 = new Friend(); //하위 클래스 타입으로 상위 클래스 객체 참조는 불가능
        //실제 객체 Friend 의 멤버 개수보다 참조번수 Friend1이 사용할 수 있는 멤버 개수가 더 많기 때문
        //GirlFriend friend1 = (GirlFriend) friend; //이전에 업캐스팅을 해준 상태가 아니기 때문에 바로 다운 캐스팅 하면 오륨

        //GirlFriend girlFriend = (GirlFriend) Friend;

        friend.friendInfo();
        boyFriend.friendInfo();
        girlfriend.friendInfo();

        //======================================================================================
        Father father = new Father();
        Parents parents = (Parents) father;  //업캐스팅 //Father 이라는 하위클래스 객체를 상위 클래스 Parents 타입으로 변환 (생략 가능)
        Father father2 = (Father) parents; //다운캐스팅 //Parents 라는 상위클래스 객체를 Father 이라는 하위클래스 타입의 참조변수로 타입 변환하여 참조변수 Father2 에 할당 (생략 불가능)
        // Mother Mother = (Mother) father; //상속 관계가 아니므로 타입 변환 불가 --> 에러 발생

        //참조변수가 참조되어있는 객체를 형변환

    }
}
class Friend { //상위 클래스 1
    public void friendInfo() {
        System.out.println("나는 당신의 친구입니다.");
    }
}

class BoyFriend extends Friend { //하위 클래스 1-1
    public void friendInfo() {
        System.out.println("나는 당신의 남자친구 입니다.");
    }
}

class GirlFriend extends Friend { //하위 클래스 1-2
    public void friendInfo() {
        System.out.println("나는 당신의 여자친구 입니다.");
    }
}

class Parents { //상위 클래스 2
    public void parentsInfo() {
        System.out.println("나는 부모님입니다.");
    }
}
class Father extends Parents { //하위 클래스 2-1
    public void parentsInfo() {
        System.out.println("나는 아빠입니다.");
    }
}

class Mother extends Parents { //하위 클래스 2-2
    public void parentsInfo() {
        System.out.println("나는 엄마입니다.");
    }
}
