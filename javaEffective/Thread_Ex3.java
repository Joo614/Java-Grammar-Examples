public class Thread_Ex3 {
    // 스레드 생성 --- 익명 객체 활용 --- 익명 Runnable 구현 객체 사용, 익명 Thread 하위 객체 사용//
    public static void main(String[] args) {

        // 익명 Runnable 구현 객체를 활용하여 스레드 생성
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("#");
                }
            }
        });

        thread1.start();

        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }

        System.out.println(" ");

        //익명 Thread 하위 객체를 활용한 스레드 생성
        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("#");
                }
            }
        };

        thread2.start();

        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}