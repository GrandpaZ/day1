package Replit;
import java.util.Scanner;

public class _027_School_Grades_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to the Grader");
        System.out.println(" Please enter the name for Subject name 1 and Score for this subject");
        String subject1=scanner.next();
        double score1= scanner.nextDouble();
        System.out.println(" Please enter the name for Subject name 2 and Score for this subject");
        String subject2=scanner.next();
        double score2= scanner.nextDouble();
        System.out.println(" Please enter the name for Subject name 3 and Score for this subject");
        String subject3=scanner.next();
        double score3= scanner.nextDouble();
        System.out.println(" Please enter the name for Subject name 4 and Score for this subject");
        String subject4=scanner.next();
        double score4= scanner.nextDouble();
        System.out.println(" Please enter the name for Subject name 5 and Score for this subject");
        String subject5=scanner.next();
        double score5= scanner.nextDouble();
        double averageScore = (score1+score2+score3+score4+score5)/5;
        System.out.println(" Summary : "+subject1+"-"+score1+" , "+subject2+"-"+score2+" , "+subject3+"-"+score3
                +" , "+subject4+"-"+score4+" , "+subject5+"-"+score5+" ");
        System.out.println(" Your average score = "+averageScore);
        System.out.println(" Thank you for using Grader");
        System.out.println(" Good bye");






    }
}
