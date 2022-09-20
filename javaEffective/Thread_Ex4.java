public class Thread_Ex4 {
    // 스레드 --- 이름 조회, 이름 변경, 스레드 인스턴스 주소값 조회 //
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("스레드 이름 가져와");
            }
        });
        thread1.start();
        System.out.println("thread3.getName() = " + thread1.getName()); //스레드 이름 조회 --> 스레드참조값.getName()

        System.out.println("-------------------------------------------------------------------------------------------------");

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("스레드 이름 설정하고 가져와");
            }
        });
        thread2.start();
        System.out.println("thread4.getName() = " + thread2.getName()); //일단 이름 가져와봐
        thread2.setName("Hyun ju"); //이걸로 바꿔 //스레드 이름 변경 --> 스레드참조값.setName()
        System.out.println("thread4.getName() = " + thread2.getName()); //다시 가져와봐

        System.out.println("-------------------------------------------------------------------------------------------------");

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread3.start();
        System.out.println(Thread.currentThread().getName()); //스레드 인스턴스의 주소값


    }
}
