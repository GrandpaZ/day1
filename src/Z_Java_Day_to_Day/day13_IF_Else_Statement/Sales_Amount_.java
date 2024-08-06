package Z_Java_Day_to_Day.day13_IF_Else_Statement;

public class Sales_Amount_ {
    public static void main(String []args){
        double bonus = 0;
        double salesAmount = 2000.55;
        if (salesAmount<=1000){
            System.out.println("Good job , you qualified for bonus  ");
           double newBonus=bonus+50;
            System.out.println("Your bonus for salesAmount is "+newBonus);
        }else {
            System.out.println("Great job , you qualified for full bonus : ");
            double newBonus=bonus+100;
            System.out.println("Your bonus for salesAmount is "+newBonus);
        }









    }
}
