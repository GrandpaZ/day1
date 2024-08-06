package Z_Java_Day_to_Day.day_15_Logical_Statement;
import java.util.Scanner;
public class Grade__ {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to GradeEvaluator ");
        System.out.println(" Please enter your grade ");
        char grade = scanner.next().charAt(0);
        if (grade=='a'||grade=='A'||grade=='b'||grade=='B'||
            grade=='c'||grade=='C'
        ){
            System.out.println("you've passed with grade - "+grade);
        }else if (grade=='d'||grade=='D'){
            System.out.println("you've qualify for retake with grade - "+grade);
        }else if (grade=='e'||grade=='E'){
            System.out.println("you've fail the class with grade - "+grade);
        }else{
            System.out.println(" Invalid Grade ");
        }








    }
}
