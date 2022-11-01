public class No2 {
    public static void main(String[] args) throws Exception {
        Integer[] list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Double[] list2 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0};
        Avg<Integer> s1 = new Avg<Integer>(list1);
        Avg<Double> s2 = new Avg<Double>(list2);
        for(Integer i: list1){
            System.out.print(i+" ");
        }
        System.out.println("; Sum: "+s1.sum()+", Average: "+s1.avg());
        for(Double j: list2){
            System.out.print(j+" ");
        }
        System.out.println("; Sum: "+s1.sum()+", Average: "+s2.avg());
    }
}
