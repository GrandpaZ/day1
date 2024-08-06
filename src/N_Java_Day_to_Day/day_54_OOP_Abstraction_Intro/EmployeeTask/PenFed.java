package N_Java_Day_to_Day.day_54_OOP_Abstraction_Intro.EmployeeTask;

import java.time.LocalDate;

public class PenFed {
    public static void main(String[] args) {
        Tester tester1=new Tester("Abd Skr",'M', LocalDate.of(1998,11,20),"QA",110000);
        System.out.println(tester1.gender);
        System.out.println(tester1.DOfB);
        Developer developer1=new Developer("Xax Akax",'M', LocalDate.of(1988,12,22),"QA",120000);



        System.out.println(developer1);



    }

}
