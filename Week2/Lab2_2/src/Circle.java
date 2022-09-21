public class Circle {
    public static double PI = 3.14159265;
    int r;

    public Circle(int r){
        this.r = r;
    }

    public void circumference(){
        System.out.println("원의 둘레: " + 2*PI*r);
    }

    public void width(){
        System.out.println("원의 넓이: " + PI*r*r);
    }

    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(5);
        circle.circumference();
        circle.width();
    }
}