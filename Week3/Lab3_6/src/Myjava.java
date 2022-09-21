public class Myjava {
    public static void main(String[] args) throws Exception {
        int a = 30;
        int b = 45;
        System.out.println("swap 전, a = " + a + "b = " + b);

        swapFunction(a,b);
        System.out.println("\n**여기서는 swap 하기 전과 후의 값이 똑같습니다.**:");
        System.out.println("swap 후, a = " + a + " b 는 " +b);
    }

    public static void swapFunction(int a, int b){
        System.out.println("\nswapping 전(Inside), a = " + a + " b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("swapping 후(Inside), a = " + a + " b = " + b);
    }
}
