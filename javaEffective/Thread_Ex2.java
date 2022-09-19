class ThreadTask2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("#"); // # - 작업 스레드의 반복문 코드 실행으로 출력 (아래 @와 비교)
        }
    }
}
public class Thread_Ex2 {
    // 스레드 생성 --- Thread 클래스를 상속 받은 하위 클래스에서 run()을 구현하여 스레드 생성 후 실행
    public static void main(String[] args) {

        //인터페이스 구현하여 하는 방법과 달리
        //Thread 클래스를 직접 인스턴스화 하지 않음
        ThreadTask2 thread2 = new ThreadTask2(); // 위 Thread 클래스를 상속받은 클래스를 인스턴스화하여 스레드를 생성

        thread2.start(); //start() 메서드로 thread1 작업스레드 실행 -> run() 내부 코드 처리

        // 반복문 추가
        for (int i = 0; i < 100; i++) {
            System.out.print("@"); // @ - 메인 스레드의 반복문 코드 실행으로 출력 (위 #과 비교)
        }

        //메인 스레드(main())와 작업 스레드(run())가 동시에 병렬로 각각 실행되었기에 두가지 문자가 섞여서 출력 (결과는 실행 시 마다 문자 섞인 것이 다를 수 있음)
    }
}
