import java.util.List;

public class Avg<T extends Number> extends Sum {
    
    public Avg(List arr) {
        super(arr);
    }

    public <Number> double avg(){
        return sum()/arr.size();
    }
    
}
