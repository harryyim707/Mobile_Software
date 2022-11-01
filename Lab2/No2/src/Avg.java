public class Avg<T extends Number> extends Sum {
    
    public Avg(T[] arr) {
        super(arr);
    }

    public T avg(){
        if(arr[0] instanceof Integer){
            Integer avg = 0;
            for(int i=0;i<20;i++){
                avg += arr[i].intValue();
            }
            avg /= 20;
            return (T) avg;
        }
        else{
            Double avg = 0.0;
            for(int i=0;i<20;i++){
                avg += arr[i].doubleValue();
            }
            avg /= 20;
            return (T)avg;
        }
    }
    
}
