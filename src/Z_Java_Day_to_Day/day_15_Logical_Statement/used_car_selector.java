package Z_Java_Day_to_Day.day_15_Logical_Statement;

public class used_car_selector {
    public static void main(String []args){
        int budget = 5000;
        int tesla=4500;
        int toyota=4500;
        int honda=4500;
        if (budget<=tesla||budget<=toyota||budget<=honda){
            System.out.println("you can afford one of these cars");
        }else {
            System.out.println("you can not afford one of these cars");
        }











    }
}
