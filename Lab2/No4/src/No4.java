public class No4{
    public static void main(String[] args) throws Exception {
        int[] A = { 3, 2, 5, 7, 8, 9, 10, 2, 7, 8 };
        int[] B = { 4, 3, 7, 3, 2, 6, 1, 0, 1, -2 };
        int[] C = new int[10];
        Mul t0 = new Mul(A[0], B[0]);
        Mul t1 = new Mul(A[1], B[1]);
        Mul t2 = new Mul(A[2], B[2]);
        Mul t3 = new Mul(A[3], B[3]);
        Mul t4 = new Mul(A[4], B[4]);
        Mul t5 = new Mul(A[5], B[5]);
        Mul t6 = new Mul(A[6], B[6]);
        Mul t7 = new Mul(A[7], B[7]);
        Mul t8 = new Mul(A[8], B[8]);
        Mul t9 = new Mul(A[9], B[9]);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        
        C[0]=t0.getResult();
        C[1]=t1.getResult();
        C[2]=t2.getResult();
        C[3]=t3.getResult();
        C[4]=t4.getResult();
        C[5]=t5.getResult();
        C[6]=t6.getResult();
        C[7]=t7.getResult();
        C[8]=t8.getResult();
        C[9]=t9.getResult();

        for(int i=0;i<10;i++){
            System.out.println("C["+i+"] = A["+i+"] * B["+i+"] = "+A[i]+" * "+B[i]+" = "+C[i]);
        }
    }
}

class Mul extends Thread{
    private int x;
    private int y;
    private int res;
    
    Mul(int A, int B){
        this.x = A;
        this.y = B;
    }

    public void run(){
        res = x*y;
    }
    public int getResult(){
        return res;
    }
}