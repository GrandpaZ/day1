package Z_Java_Day_to_Day.day_29_loop5;

import java.util.Scanner;

public class room_reservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total =0;
        while (true) {
            System.out.println("******Welcome to room reservation******");
            System.out.println("1--------King bed ==>120$");
            System.out.println("2--------Queen bed ==>100$");
            System.out.println("3--------Single bed ==>80$");
            System.out.println("Which room would you like ");
            int option =input.nextInt();
           switch (option){
               case 1:
                   total+=120;
                   break;
               case 2:
                   total+=100;
                   break;
               case 3:
                   total+=80;
                   break;}

            System.out.println("would you like to reserve another room");
            String a=input.next().toLowerCase();
            while (!a.equals("yes") || a.equals("no")){
                System.out.println("please re-enter");
                System.out.println("would you like to reserve another room");
                 a=input.next().toLowerCase();}

          if (a.equals("no")){
              break;
          }
        }
        System.out.println("you total will be "+total);
    }

}
