package Z_Java_Day_to_Day.day13_IF_Else_Statement;

import java.util.Scanner;

public class Tem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Could you please enter the temperature of today ?");
        int tem = scanner.nextInt();
        if (tem>=70){
            System.out.println("It is a beautiful day ");
            System.out.println("Let's code java");
        }else {
            System.out.println("It is kind of cold today");
            System.out.println("Stay home and code java");
        }










    }
}
