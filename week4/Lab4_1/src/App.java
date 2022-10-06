class Overloading{
    public void say(){
        System.out.println("안녕하세요");
    }
    public void say(String msg){
        System.out.println(msg);
    }
    public void say(String msg, int n){
        for(int i=0; i<n; i++){
            System.out.println(msg);
        }
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Overloading a = new Overloading();
        a.say();
        a.say("점심 돈까스 어떠세요?");
        a.say("좋습니다.", 3);
    }
}
