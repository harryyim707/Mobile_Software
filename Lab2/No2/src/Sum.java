import java.util.List;

public class Sum<T extends Number> {
    List<T> arr;
    public Sum(List<T>arr){
        this.arr=arr;
    }
    public <Number> double sum(){
        double sum=0;
        for(T i: arr){
            sum += i.doubleValue();
        }
        return sum;
    }
}
