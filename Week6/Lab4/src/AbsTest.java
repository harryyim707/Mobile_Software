public class AbsTest {
    public static void main(String[] args) throws Exception {
        Salary k = new Salary("김민재", "서울", 32, 3600.00);
        Employee e = new Salary("김민준", "부산", 2, 2400.00);

        System.out.println("Abstract -----------------");
        System.out.println(k.computePay());
        System.out.println(e.computePay());
    }
}
