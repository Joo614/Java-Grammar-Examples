public class Generic_Ex4 {
    // 제네릭 와일드카드 < ? > //
    public static void main(String[] args) {
        //call 은 상위클래스 Phone 클래스를 상속받았기에 그 하위클래스들도 모두 사용 가능
        PhoneFunction.call(new User<Phone>(new Phone()));
        PhoneFunction.call(new User<IPhone>(new IPhone()));
        PhoneFunction.call(new User<Galaxy>(new Galaxy()));
        PhoneFunction.call(new User<IPhone13Pro>(new IPhone13Pro()));
        PhoneFunction.call(new User<IPhone13>(new IPhone13()));
        PhoneFunction.call(new User<ZFlip4>(new ZFlip4()));
        PhoneFunction.call(new User<ZFlip3>(new ZFlip3()));

        System.out.println("\n######################################\n");

        //faceId 는 IPhone 클래스를 상속받았기에 해당 클래스와 상속받은 하위클래스들만 사용 가능
//        PhoneFunction.faceId(new User<Phone>(new Phone())); // 상속 X
        PhoneFunction.faceId(new User<IPhone>(new IPhone()));
        PhoneFunction.faceId(new User<IPhone13Pro>(new IPhone13Pro()));
        PhoneFunction.faceId(new User<IPhone13>(new IPhone13()));
//        PhoneFunction.faceId(new User<Galaxy>(new Galaxy())); // 상속 X
//        PhoneFunction.faceId(new User<ZFlip4>(new ZFlip4())); // 상속 X
//        PhoneFunction.faceId(new User<ZFlip3>(new ZFlip3())); // 상속 X

        System.out.println("\n######################################\n");

        //samsungPay 는 Galaxy 클래스를 상속받았기에 해당 클래스와 상속받은 하위클래스들만 사용 가능
//        PhoneFunction.samsungPay(new User<Phone>(new Phone())); // 상속 X
//        PhoneFunction.samsungPay(new User<IPhone>(new IPhone())); // 상속 X
//        PhoneFunction.samsungPay(new User<IPhone13Pro>(new IPhone13Pro())); // 상속 X
//        PhoneFunction.samsungPay(new User<IPhone13>(new IPhone13())); // 상속 X
        PhoneFunction.samsungPay(new User<Galaxy>(new Galaxy()));
        PhoneFunction.samsungPay(new User<ZFlip4>(new ZFlip4()));
        PhoneFunction.samsungPay(new User<ZFlip3>(new ZFlip3()));

        System.out.println("\n######################################\n");

        //recordVoice 는 Galaxy 클래스와 그보다 상위클래스만 사용 가능
        PhoneFunction.recordVoice(new User<Phone>(new Phone()));
//        PhoneFunction.recordVoice(new User<IPhone>(new IPhone())); // X
//        PhoneFunction.recordVoice(new User<IPhone13Pro>(new IPhone13Pro())); // X
//        PhoneFunction.recordVoice(new User<IPhone13>(new IPhone13())); // X
        PhoneFunction.recordVoice(new User<Galaxy>(new Galaxy()));
//        PhoneFunction.recordVoice(new User<ZFlip4>(new ZFlip4())); // X
//        PhoneFunction.recordVoice(new User<ZFlip3>(new ZFlip3())); // X
    }
}
class Phone {}

class IPhone extends Phone {} //Phone 클래스 상속받은 IPhone 클래스
class Galaxy extends Phone {} //Phone 클래스 상속받은 Galaxy 클래스

class IPhone13Pro extends IPhone {} //Phone 클래스 상속받은 IPhone 클래스를 상속받은 IPhone13Pro 클래스
class IPhone13 extends IPhone {} //Phone 클래스 상속받은 IPhone 클래스를 상속받은 IPhone13 클래스

class ZFlip4 extends Galaxy {} //Phone 클래스 상속받은 Galaxy 클래스를 상속받은 ZFlip4 클래스
class ZFlip3 extends Galaxy {} //Phone 클래스 상속받은 Galaxy 클래스를 상속받은 ZFlip3 클래스

class User<T> {
    public T phone;

    public User(T phone) {
        this.phone = phone;
    }
}

class PhoneFunction {
    public static void call(User<? extends Phone> user) { //휴대폰의 기본적인 통화 기능 //모든 휴대폰에서 사용 가능
        //? extends Phone 으로 타입 제한
        System.out.println("----------------------------");
        System.out.println("user.phone = " + user.phone.getClass().getSimpleName());
        System.out.println("모든 Phone은 통화를 할 수 있습니다.");
    }

    public static void faceId(User<? extends IPhone> user) { //애플의 안면 인식 보안 기능 //아이폰만 사용 가능
        //? extends IPhone 으로 타입 제한
        System.out.println("---------------------------");
        System.out.println("user.phone = " + user.phone.getClass().getSimpleName());
        System.out.println("IPhone만 Face ID를 사용할 수 있습니다. ");
    }

    public static void samsungPay(User<? extends Galaxy> user) { //삼성 휴대폰의 결제 기능 //삼성 휴대폰에서만 사용 가능
        //? extends Galaxy 로 타입 제한
        System.out.println("-----------------------------");
        System.out.println("user.phone = " + user.phone.getClass().getSimpleName());
        System.out.println("Galaxy만 삼성 페이를 사용할 수 있습니다. ");
    }

    public static void recordVoice(User<? super Galaxy> user) { //통화 녹음 기능 //아이폰을 제외한 안드로이드 휴대폰에서만 사용 가능
        //? super Galaxy 로 타입 제한 -> 해당 클래스와 그보다 상위 클래스만 타입으로 지정해줌
        System.out.println("-----------------------------");
        System.out.println("user.phone = " + user.phone.getClass().getSimpleName());
        System.out.println("안드로이드 폰에서만 통화 녹음이 가능합니다. ");
    }
}