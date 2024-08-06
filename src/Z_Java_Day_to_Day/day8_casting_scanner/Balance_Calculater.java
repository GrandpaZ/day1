package Z_Java_Day_to_Day.day8_casting_scanner;

public class Balance_Calculater {
    public static void main(String []args){
        double balance=345.55;
        double p1=20.88;
        double p2=89.99;
        double p3=15;
        double total=p1+p2+p3;
        double ibalance=balance-total;
        int balanceWithoutCents=(int)ibalance;


                System.out.println("your balance will be : "+ibalance);
                System.out.println(" your balance without cents : "+balanceWithoutCents);







    }




}
