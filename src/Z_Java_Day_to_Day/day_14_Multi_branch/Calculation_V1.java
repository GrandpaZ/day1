package Z_Java_Day_to_Day.day_14_Multi_branch;

public class Calculation_V1 {
    public static void main(String []args){
        int num1 = 10;
        int num2 = 20;
        String operator ="-";
        if (operator =="+"){
            System.out.println("Num1+num2 : add = "+(num1+num2));
        }else  if (operator =="-"){
            System.out.println("Num1-num2 : minus = "+(num1-num2));
        }else if (operator =="*"){
            System.out.println("Num1*num2 : multiply = "+(num1*num2));
        }else if (operator =="/"){
            System.out.println("Num1/num2 : divide = "+(num1/num2));
        }else{
            System.out.println("invalid operator");}






    }
}
