package thread;
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message){
        this.message = message;
    }
    int i = 0;

    @Override
    public void run() {
        while(i<10){
            System.out.println(message);
            i++;
        }
    }
}
