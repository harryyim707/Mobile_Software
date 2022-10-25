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
        return personName;
    }
    String getBirthDate(){
        return birthDate;
    }
    void setName(String name){
        personName = name;
    }
    void setBirthDate(String date){
        birthDate=date;
    }
}
