package N_Java_Day_to_Day.day_49_Inheritanc_Practice.ScrumTeamTasks;

public class Tester extends Employee {
    public Tester(String name,int age,char gender,double Salary,int ID,String jobTitle){
        setInfo(name,age,gender,Salary,ID,jobTitle);}
    public void smokeTesting(){System.out.println("Tester "+name+" is performing smkoe test");}
    public void creatingTicket(){System.out.println(name+" is creating ticket on JIRA");}

}
