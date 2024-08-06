package N_Java_Day_to_Day.day_44_Constructor;

public class Employee {
    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;
    public void setEmployeeInfo(String name,int id,int ssn,String jobTitle,double salary,char gender){
        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }
}
