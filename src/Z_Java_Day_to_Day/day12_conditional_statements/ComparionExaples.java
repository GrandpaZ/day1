package Z_Java_Day_to_Day.day12_conditional_statements;

public class ComparionExaples {
    public static void main(String[] args) {

    int speendLimit=55;
    int currentSpeed=45;
    System.out.println(currentSpeed>speendLimit);
    System.out.println(speendLimit<currentSpeed);
    boolean isSpeeding=currentSpeed>speendLimit;
    System.out.println("Are You Speeding ? - "+isSpeeding);
    System.out.println("Current Speend - "+currentSpeed+"MPH");
    System.out.println("Speed Limit - "+speendLimit+"MPH");
    System.out.print("\n");
    currentSpeed=60;
    isSpeeding=currentSpeed>speendLimit;
    System.out.println("Are You Speeding ? - "+isSpeeding);
    System.out.println("Current Speend - "+currentSpeed+"MPH");
    System.out.println("Speed Limit - "+speendLimit+"MPH");
    System.out.print("\n");
    double accountBalance=250.35;
    double itemPrice=100.99;
    System.out.println("Can I afford ? -  "+(accountBalance>=itemPrice));
    boolean canAfford=accountBalance>=itemPrice;
    System.out.println("Can Afford - "+canAfford);
    accountBalance-=itemPrice;
    boolean isBroke=accountBalance<=0;
    System.out.println("Am I broke - "+isBroke);





    }
}
