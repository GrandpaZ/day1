package day12_conditional_statements;
import java.sql.SQLOutput;
import java.util.Scanner;
public class IF {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter you exam score");
        int score= scan.nextInt();
        if (score>=60){
            System.out.println("You pass the Exam");
            System.out.println("You did a good job! Keep it up");
        }else {
            System.out.println("You fail the Exam");
            System.out.println("Please study and try to pass next Exam");
        }





    }
}
