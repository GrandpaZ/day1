package N_Java_Day_to_Day.day_49_Inheritanc_Practice.ScrumTeamTasks;

public class Developer extends Employee {
    public Developer(String name,int age,char gender,double Salary,int ID,String jobTitle){setInfo(name,age,gender,Salary,ID,jobTitle);}
    public void coding(){System.out.println(name+" is developing code ,while hitting his head to work");}
    public void fixBug(){System.out.println(name+" is fixing a bug while cursing the tester");}







}
