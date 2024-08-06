package N_Java_Day_to_Day.day_54_OOP_Abstraction_Intro.EmployeeTask;

import java.time.LocalDate;

public final class Tester extends Employee {

    public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary){
        super(name,gender,DOfB, jobTitle,salary);
    }
    public void findBug(){
        System.out.println(name+" find a bug");
    }











}
