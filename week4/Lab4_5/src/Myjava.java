public class Myjava {
    public static void main(String[] args) throws Exception {
        try{
            int num[] = {1,2,3,4};
            System.out.println(num[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 실행 매개값의 수가 부족합니다.");
        } catch(Exception e){
            System.out.println("실행에 문제가 있습니다.");
        }finally{
            System.out.println("다시 실행해 주세요.");
        }
    }
}
