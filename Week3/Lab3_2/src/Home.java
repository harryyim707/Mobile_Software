class Sofa{}
public class Home extends Sofa {
    public static void main(String[] args) throws Exception {
        Sofa a = new Home();
        boolean result = a instanceof Home;
        System.out.println(result);
    }
}
