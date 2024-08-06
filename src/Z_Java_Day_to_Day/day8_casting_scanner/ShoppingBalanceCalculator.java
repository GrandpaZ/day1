package Z_Java_Day_to_Day.day8_casting_scanner;

public class ShoppingBalanceCalculator {

    public static void main(String[] args){

         double balance= 345.55d;
         double price1=20.88d;
         double price2=89.99d;
         double price3=15.00d;
         double remainingBalance=balance-price1-price2-price3;
         System.out.println("\n\t Your Initial Balance : $" + balance);
         System.out.println("\n\t RemainingBalance : $ "+ remainingBalance);
         int balanceWithNoCents=(int)remainingBalance;
         double balanceWithCents=remainingBalance;
         System.out.println("\n\t Balance Without Cents : $ "+balanceWithNoCents);
         System.out.println("\n\t Balance With Cents : $ "+balanceWithCents);


    }
}
