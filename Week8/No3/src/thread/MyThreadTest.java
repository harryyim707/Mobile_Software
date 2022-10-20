package thread;
public class MyThreadTest {
    public static void main(String[] args) throws Exception {
        Runnable hello = new DisplayMessage("안녕하세요");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true);
        thread1.setName("안녕하세요");

        System.out.println("hello 쓰레드를 실행합니다...");
        thread1.start();

        Runnable bye = new DisplayMessage("안녕히 가세요");
        Thread thread2 = new Thread(bye);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setDaemon(true);
        System.out.println("goodbye 쓰레드를 실행합니다...");
        thread2.start();

        System.out.println("thread3을 실행합니다...");
        Thread thread3 = new GuessANumber(34);
        thread3.start();

        System.out.println("thread4를 실행합니다...");
        Thread thread4 = new GuessANumber(100);

        thread4.start();
        System.out.println("main()이 끝났습니다...");
    }
}
