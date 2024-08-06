package Z_Java_Day_to_Day.day10_shorthand_operators;
import java.util.Scanner;
public class nice_line_bug {
    public static void main(String []args){;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" please enter your rent ");
        double rent=scanner.nextInt();
        System.out.println(" please enter your month ");
        scanner.nextLine();
        String month =scanner.nextLine();
        System.out.print(" ");
        System.out.println("you rent is : "+rent+" And your month is : "+month);










    }
}
