import java.util.*;

public class No1 {
    public static int[][] rate = {{3,1,5,2,5},
                        {4,2,1,4,2},
                        {5,3,1,2,4},
                        {2,1,5,4,4},
                        {3,3,4,3,3}};
    public static double cartesian;
    public static void NoOne(){
        System.out.println("1)");
        System.out.println("영화별 평균 평가점수: ");
        double[] m = MeanOfFilms();
        for(int i=0; i<m.length;i++){
            System.out.println("영화 "+(100+i)+"의 평균 평가 점수: "+m[i]);
        }
        System.out.println("사용자별 평균 점수: ");
        double[] u = MeanOfUsers();
        for(int i=0;i<u.length;i++){
            System.out.println("사용자 "+i+"의 평균 점수: "+u[i]);
        }
    }
    public static double[] MeanOfUsers(){
        double[] ret = new double[5];
        for(int i=0; i<5;i++){
            int sum=0;
            for(int j=0;j<5;j++){
                sum += rate[i][j];
            }
            ret[i] = sum/5.0;
        }
        return ret;
    }
    public static double[] MeanOfFilms(){
        double[] ret = new double[5];
        for(int i=0;i<5;i++){
            int sum=0;
            for(int j=0;j<5;j++){
                sum+=rate[j][i];
            }
            ret[i] = sum/5.0;
        }
        return ret;
    }
    public static void NoTwo(){
        System.out.println("2)");
        System.out.println("영화 번호 100 ~ 104를 입력해 주세요.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() - 100;
        in.close();
        System.out.print("비슷한 영화: ");
        for(int e: Cart(n)){
            if(e != -1){
                System.out.print((100+e)+" ");
            }
        }
        System.out.println();
        System.out.println("Cartesian distance: "+cartesian);
    }
    public static int[] Cart(int n){
        int[] ans = {-1,-1,-1,-1,-1};
        int k = 0;
        double min=10000;
        for(int i=0;i<5;i++){
            if(i==n) continue;
            double sum=0;
            for(int j=0;j<5;j++){
               sum += Math.pow(rate[j][i]-rate[j][n],2);
            }
            double cart = Math.pow(sum, 0.5);
            if(min>=cart){
                if(min==cart){
                    ans[++k] = i;
                }
                ans[k] = i;
                min = cart;
            }
        }
        cartesian = min;
        return ans;
    }

    public static void main(String[] args) throws Exception {
        NoOne();
        NoTwo();

    }
}
