package Replit;

import java.util.Scanner;
public class _022_Shopping_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter the item 1 name then the price");
        String item1=scanner.next();
        double price1=scanner.nextDouble();
        System.out.println(" Please Enter the item 2 name then the price");
        String item2=scanner.next();
        double price2=scanner.nextDouble();
        System.out.println(" Please Enter the item 3 name then the price");
        String item3=scanner.next();
        double price3=scanner.nextDouble();
        System.out.println(" Please Enter the item 4 name then the price");
        String item4=scanner.next();
        double price4=scanner.nextDouble();
        double total=price1+price2+price3+price4;
        System.out.println("Item 1 "+item1+":"+price1+" , "+"Item 2 "+item2+":"+price2+" , "+"Item 3 "+item3+":"+price3+" , "+"Item 4 "+item4+":"
                +price4+"\n\tTotal will be = "+total+" $$$ ");







    }
}
