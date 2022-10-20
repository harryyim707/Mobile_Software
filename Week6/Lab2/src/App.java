class Animal{
    public void move(){
        System.out.println("동물은 걸을 수 있습니다.");
    }
}
class Cat extends Animal{
    public void move(){
        System.out.println("고양이는 걷고 뛸 수 있습니다.");
    }
    public void mew(){
        System.out.println("고양이는 소리를 낼 수도 있습니다.");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Animal a = new Animal();
        Cat b = new Cat();
        a.move();
        b.move();
        b.mew();
    }
}
