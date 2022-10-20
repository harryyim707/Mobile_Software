public class Box<T> {
    private T t;
    public void add(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args) throws Exception {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(2019);
        stringBox.add(new String("안녕하세요"));

        System.out.printf("Integer 값: %d\n\n", integerBox.get());
        System.out.printf("String 값: %s\n", stringBox.get());
    }
}
