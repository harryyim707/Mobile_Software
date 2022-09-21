public class InstanceCounter {
    private static int numInstances = 0;

    protected static int getCount(){
        return numInstances;
    }

    private static void addInstance(){
        numInstances++;
    }

    InstanceCounter(){
        InstanceCounter.addInstance();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("시작 인스턴스 :"+InstanceCounter.getCount());
        for(int i=0;i<500;i++){
            new InstanceCounter();
        }
        System.out.println("만들어진 인스턴스: "+InstanceCounter.getCount());
    }
}
