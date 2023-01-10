package day13_IF_Else_Statement;
import java.util.Scanner;
public class if_esle {
    public static void main(String[] args) {
        System.out.println("Welcome to Abdu Smoke Shop");
        System.out.println("Do you Somke Ukam?");
        Scanner scan=new Scanner(System.in);
        String  anwser=scan.nextLine();
        if(anwser.equalsIgnoreCase("yes")){
            System.out.println("Skr ,How old are you ukam?");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("Xax,You can smoke,How much money do you have ?");
        double money= scan.nextDouble();
        if(money>=8.438){
            System.out.println("Skr,You can afford the Xiang Yan");
            System.out.println("Do you want longer or shorter XiangYan");
            scan.nextLine();
            String LS=scan.nextLine();


         if(LS.equalsIgnoreCase("long")){
             System.out.println("Okay , you will have " +(money-10)+"$ left , be smart ukam");
         }
         else {
             System.out.println("We do not have it , fuck off! ");
         }

        }
        else{
            System.out.println("GO make some more money , ukam ");
        }

        }else{
            System.out.println("You are not Xax , go wait for "+(18-age)+" years to talk to me ukam");
        }




        }else{
            System.out.println("Please Fuck off, I am a busy man, don\'t talk to me");
        }
    }
}
