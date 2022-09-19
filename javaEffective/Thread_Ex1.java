class ThreadTask1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("#"); // # - 작업 스레드의 반복문 코드 실행으로 출력 (아래 @와 비교)
        }
    }
}
public class Thread_Ex1 {
    // 스레드 생성 --- 인터페이스 구현 클래스에서 run() 구현하여 스레드 생성 후 실행
    public static void main(String[] args) {

        Runnable task1 = new ThreadTask1(); //위 Runnable 인터페이스를 구현한 객체 생성
        Thread thread1 = new Thread(task1); //Runnable 구현 객체의 참조변수를 인자로 전달하면서 Thread 클래스를 인스턴스화 하여 스레드 생성
        //Thread thread1 = new Thread(new ThreadTask1()); //위 두 줄의 축약형 ( 객체 자체를 인자로 전달 )

        thread1.start(); //start() 메서드로 thread1 작업스레드 실행 -> run() 내부 코드 처리

        //반복문 추가
        for(int i = 0; i < 100; i++) {
            System.out.print("@"); // @ - 메인 스레드의 반복문 코드 실행으로 출력 (위 #과 비교)
        }

        //메인 스레드(main())와 작업 스레드(run())가 동시에 병렬로 각각 실행되었기에 두가지 문자가 섞여서 출력 (결과는 실행 시 마다 문자 섞인 것이 다를 수 있음)
    }
}
