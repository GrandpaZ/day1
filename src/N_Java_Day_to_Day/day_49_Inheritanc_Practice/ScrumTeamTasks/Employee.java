package N_Java_Day_to_Day.day_49_Inheritanc_Practice.ScrumTeamTasks;

public class Employee extends person {
    public double Salary;
    public int ID;
    public String jobTitle;
    public void setInfo(String name,int age,char gender,double Salary,int ID,String jobTitle){
        setInfo(name,age,gender);
        this.Salary=Salary;
        this.ID=ID;
        this.jobTitle=jobTitle;}
    public void work(){System.out.println(name+" is working ");}
    public String toString(){
        return "ID: "+ID+", Job Title: "+jobTitle+", Name: "+name+", Age: "+age+", Gender: "+gender+", Salary: $"+Salary;
    }
}
