public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number){
        System.out.println("직원 구성");
        this.name=name;
        this.address=address;
        this.number=number;
    }
    public abstract double computePay();
}
