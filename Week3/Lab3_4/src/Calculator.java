public class Calculator {
    final static int n = 123;

    public static void byLoop(){
        int[] bin = new int[7];
        int tmp = n;
        for(int i =6; i>0;i--){
            bin[i]=tmp%2;
            tmp/=2;
        }
        bin[0] = tmp;
        for(int i: bin){
            System.out.print(i);
        }
        System.out.println();
    }

    public static void byBit(){
        int tmp = n;
        for(int i=6; i>=0; --i){
            int result = tmp >> i&1;
            System.out.print(result);
        }
    }
    
    public static void main(String[] args) throws Exception {
        byLoop();
        byBit();
    }
}
