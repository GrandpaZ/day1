package Replit;
import java.util.Scanner;
public class _023_Phone_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Could you please enter the 3 area code ");
        int areaCode= scanner.nextInt();
        System.out.println(" Could you please enter the 6 area code ");
        int localNumber=scanner.nextInt();
        String phoneNumber="("+areaCode+")-"+localNumber;
        System.out.println(" Calling Number "+phoneNumber);






    }
}
