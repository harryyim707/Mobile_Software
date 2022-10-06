package Info;

public class Person {
    String personName;
    String birthDate; //form of "yyyy/mm/dd"
    String homeAddress;
    public Person(String n, String date, String address){
        setName(n);
        setBirthDate(date);
        this.homeAddress=address;
    }
    String getName(){
        return this.personName;
    }
    String getBirthDate(){
        return this.birthDate;
    }
    void setName(String name){
        this.personName = name;
    }
    void setBirthDate(String date){
        this.birthDate=date;
    }
}
