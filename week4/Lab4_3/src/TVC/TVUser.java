package TVC;
public class TVUser {
    public static void main(String[] args) throws Exception {
        TV tv = new TV();
        tv.PowOn();
        tv.Chdown();
        tv.Vdown();
        tv.Vdown();
        tv.Vup();
        tv.Chdown();
        tv.Chup();
        tv.ShowStat();
    }
}
