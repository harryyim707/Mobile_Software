public class Sum<T extends Number> {
    T[] arr;

    public Sum(T[] arr) {
        this.arr = arr;
    }

    public T sum() {
        if (arr[0] instanceof Integer) {
            Integer sum = 0;
            for (int i=0; i<20;i++) {
                sum += arr[i].intValue();
            }
            return (T) sum;
        }
        else{
            Double sum = 0.0;
            for (int i=0;i<20;i++) {
                sum += arr[i].intValue();
            }
            return (T) sum;
        }
    }
}
