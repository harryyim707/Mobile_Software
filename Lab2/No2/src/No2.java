import java.util.ArrayList;
import java.util.List;

public class No2 {
    public static void main(String[] args) throws Exception {
        List<Integer> list1 = new  ArrayList<Integer>();
        List<Double> list2 = new ArrayList<Double>();
        for(int i=1;i<=20;i++){
            list1.add(i);
            list2.add((double)i);
        }
        Avg<Integer> s1 = new Avg<Integer>(list1);
        Avg<Double> s2 = new Avg<Double>(list2);
        for(Integer i: list1){
            System.out.print(i+" ");
        }
        System.out.println("; Sum: "+(int)s1.sum()+", Average: "+s1.avg());
        for(Double j: list2){
            System.out.print(j+" ");
        }
        System.out.println("; Sum: "+s1.sum()+", Average: "+s2.avg());
    }
}
