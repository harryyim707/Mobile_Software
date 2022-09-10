package test;
public class StaffTest {
    public static void main(String[] args) throws Exception {
        Staff stfOne = new Staff("김민준");
        Staff stfTwo = new Staff("이수빈");

        stfOne.stfAge(26);
        stfOne.stfDesignation("팀장");
        stfOne.stfSalary(1000);
        stfOne.printStaff();

        stfTwo.stfAge(21);
        stfTwo.stfDesignation( "대리");
        stfTwo.stfSalary(500);
        stfTwo.printStaff();
    }
}
