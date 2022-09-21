public class Cat{
    int catAge;
    
    public Cat(String name){
        System.out.println("고양이 이름: " + name);
    }

    public void setAge(int age){
        catAge = age;
    }

    public int getAge(){
        System.out.println("고양이의 나이: " + catAge);
        return catAge;
    }

    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("tom");

        myCat.setAge(2);
        myCat.getAge();
        System.out.println("변수 값: " + myCat.catAge);
    }
}
