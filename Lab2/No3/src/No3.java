import java.util.Enumeration;
import java.util.Vector;

public class No3 {
    public static void main(String[] args) throws Exception {
        Vector<Person> people = new Vector<Person>();
        people.add(new Student("Daniel", "2003/05/26", "Yongsan-gu Seoul", 3.0, "2022135168"));
        people.add(new Student("Ruth", "1999/12/18", "Nowon-gu Seoul", 3.7, "2018167089"));
        people.add(new Student("Troy", "2002/01/24", "Mapo-gu Seoul", 4.3, "2022134048"));
        people.add(new Student("Giselle", "2000/06/29", "Dongjak-gu Seoul", 3.9, "2020135072"));
        people.add(new Student("Jordan", "2001/10/28", "Songpa-gu Seoul", 4.0, "2021122134"));
        people.add(new Employee("Thomas", "1990/04/17", "Jungnang-gu Seoul", 250, "20151798"));
        people.add(new Employee("Leonardo", "1987/08/23", "Guro-gu Seoul", 300, "20146879"));
        people.add(new Employee("Miriam", "1976/02/14", "Seocho-gu Seoul", 500, "20104893"));
        people.add(new Employee("Donald", "1968/09/30", "Gangnam-gu Seoul", 1000, "20048962"));
        people.add(new Employee("Joe", "1973/11/16", "Jongno-gu Seoul", 550, "20086489"));

        Enumeration<Person> enu = people.elements();
        while(enu.hasMoreElements()){
            System.out.println(enu.nextElement().getName());
        }
    }
}
