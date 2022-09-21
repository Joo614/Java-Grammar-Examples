public class Thread_Ex5 {
    // 스레드 동기화(예외 발생하지 않게 하는 것) --- 임계영역 설정 --- synchronized //
    public static void main(String[] args) {

        //두 스레드 간에 객체가 공유되기 때문에 발생하는 오류가 남 (값 제대로 출력 안됨)
        // ---> 두 스레드가 동시에 실행하면 안되는 영역(임계영역)을 설정해줘야함
        // -----> if 문이 들어가 있는 withdraw 메서드를 임계영역으로 설정해야함 --> synchronized 키워드 사용
        //메서드 전체 임계영역 지정할 경우 -> 메서드 반환타입 좌측에 synchronized
        //메서드 내 특정 영역만 임계영역 지정할 경우 -> 메서드 {} 내에 synchronized(해당 영역이 포함된 객체의 참조 this) {실행할 코드}
        Runnable thradTask3 = new ThreadTask3(); //타입을 Runnable로 앞에 하면 고유 메서드들은 사용 불가 여기서는 run밖에 없어서 괜찮 / 다른 메서드가 더 있다면 타입을 ThreadTask3로 해야 모두 출력가능
        Thread thread3_1 = new Thread(thradTask3);
        Thread thread3_2 = new Thread(thradTask3);

        thread3_1.setName("현주");
        thread3_2.setName("해민");

        thread3_1.start();
        thread3_2.start();
    }
}
class Account {
    private int balance = 1000; //잔액을 나타내는 변수 //지금 잔액 얼마 있는지(초기값)

    public int getBalance() {
        return balance;
    }

    // synchronized 키워드로 메서드 전체를 임계영역으로 정해주어 예외 발생 X
    // 이 키워드를 빼고 돌리면 예외 일어남
    public synchronized boolean withdraw(int money) { //인출 성공 시 true, 인출 실패 시 false 반환
        if (balance >= money) { //인출 가능 여부 판단 : 잔액이 인출하고자 하는 금액보다 같거나 많아야함

            try { Thread.sleep(1000);} catch (Exception error) {}
            //if 문 실행부에 진입하자마자 해당 스레드를 1초 일시정지 시키고, 다른 스레드에게 제어권 강제로 넘김
            //일부러 다른 스레드가 여기에 접근할 수 있도록 문제 상황을 발생시키기 위해 추가한 코드
            //슬립은 스레드 클래스에 정의되어있는 정적 메서드

            balance -= money; //잔액에서 입출금을 깎아 새로운 잔액을 기록

            return true;
        }
        return false; //위에 조건에서 머니보다 밸런스가 더 작을 경우에 펄스
    }
}
class ThreadTask3 implements Runnable {
    Account account = new Account();

    public void run() {
        while (account.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100; //100원 ~ 300원의 사이의 인출금을 랜덤으로 받음

            boolean success = account.withdraw(money); // withdraw 를 실행시키는 동시에 인출 성공 여부를 변수에 할당

            //인출 결과 확인
            //만약, withdraw 가 false 를 리턴한다면(인출에 실패했다면, 해당내역에 "->DENIED" 출력
            System.out.printf("[ Withdraw %d₩ by %s. Balance : %s ] %n", money, Thread.currentThread().getName(), account.getBalance(),account.getBalance(),success? "->DENIED" : "");
            // Thread.currentThread() 이건 이게 위치한 곳의 스레드를 리턴함 여기서는 thread3_1 을 리턴
        }
    }

}