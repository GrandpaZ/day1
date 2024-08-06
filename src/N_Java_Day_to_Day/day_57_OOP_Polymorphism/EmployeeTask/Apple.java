package N_Java_Day_to_Day.day_57_OOP_Polymorphism.EmployeeTask;



import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {
        Employee tester1 = new Tester("Andy", 152914, "QA", 120000, 'M');
        Employee tester2 = new Tester("Judy", 123564, "SDET", 100000, 'F');

        Employee developer1 = new Developer("Nick", 654954, "TEam Lead", 990000, 'M');
        Employee developer2 = new Developer("Jim", 865923, "QA", 190000, 'M');
        ScrumMaster scrumMaster1=new ScrumMaster("jinx",987643,"Scrum Master",456654,'F');

        ArrayList<Employee> scrumTeam=new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2,developer1,developer2,scrumMaster1));
        for (Employee each :scrumTeam){
            System.out.println(each);
        }



    }
}








