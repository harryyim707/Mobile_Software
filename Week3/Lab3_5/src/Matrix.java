public class Matrix {
    public static void multiMat(int[][] A, int[][] B){
        int[][] res = new int[A.length][B[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                for(int k=0;k<A[0].length;k++){
                    res[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        for(int[] e: res){
            for(int x: e){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        multiMat(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}}, 
        new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}});
    }
}
