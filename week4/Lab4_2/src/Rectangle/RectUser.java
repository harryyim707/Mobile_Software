package Rectangle;
public class RectUser {
    public static int getArea(int w, int h){
        return w*h;
    }
    public static int getCircum(int w, int h){
        return 2*(w+h);
    }
    public static void main(String[] args) throws Exception {
        Rect rec = new Rect();
        System.out.println(getArea(rec.width, rec.height));
        System.out.println(getCircum(rec.width, rec.height));
    }
}
