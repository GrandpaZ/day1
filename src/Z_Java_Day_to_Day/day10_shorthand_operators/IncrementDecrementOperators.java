package Z_Java_Day_to_Day.day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i=1;
        System.out.println("i="+i);
        i++;
        System.out.println("i="+i);
        ++i;
        System.out.println("i="+i);
        int lineOfCode=15;
        System.out.println("Line of Code = "+lineOfCode);
        lineOfCode++;
        System.out.println("Line of Code = "+lineOfCode);
        ++lineOfCode;
        System.out.println("Line of Code = "+lineOfCode);
        lineOfCode+=1;
        System.out.println("Line of Code = "+lineOfCode);
        int wallet=88;
        System.out.println("My wallet has "+wallet+" $ ");
        wallet--;
        System.out.println("My wallet has "+wallet+" $ ");
        --wallet;
        System.out.println("My wallet has "+wallet+" $ ");
        wallet-=1;
        System.out.println("My wallet has "+wallet+" $ ");
        wallet=wallet-1;
        System.out.println("My wallet has "+wallet+" $ ");


    }
}
