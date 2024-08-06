package N_Java_Day_to_Day.day_52_Exceptions_continue;

public class ThrowPractice {
    public static void main(String[] args) {
        String driverName="Chrome";
        if (driverName.equals("chrome")){
            System.out.println("set up chrome");
        }else if (driverName.equals("firefox")){
            System.out.println("set up firefox");
        }else if (driverName.equals("opera")){
            System.out.println("set up opera");
        }else {
            throw new RuntimeException("Invalid Browser name");
            //System.out.println("Invalid browser");
        }







    }
}
