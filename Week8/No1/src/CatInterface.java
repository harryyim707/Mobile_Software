public class CatInterface implements Animal2 {
    @Override
    public void eat(){
        System.out.println("고양이가 먹습니다.");
    }
    @Override
    public void sleep(){
        System.out.println("고양이가 잡니다.");
    }
    public static void main(String[] args) throws Exception {
        CatInterface c = new CatInterface();
        c.eat();
        c.sleep();
    }
}
