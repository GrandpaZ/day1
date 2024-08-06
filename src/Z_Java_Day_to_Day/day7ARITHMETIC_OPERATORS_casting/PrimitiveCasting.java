package Z_Java_Day_to_Day.day7ARITHMETIC_OPERATORS_casting;

public class PrimitiveCasting {

    public static void main(String[] args){

        int num1=10;
        byte b1=(byte)num1;
        short s1= (short) num1;
        long  l1=(long)num1;
        double d1=num1;
        float f1= num1;
        char ch=(char) num1;
        //byte->short->char->int->long->float->double(primitive casting)


        System.out.println(num1);
        System.out.println(b1);
        System.out.println(s1);
        System.out.println((long)num1);
       // System.out.println(d1);
        System.out.println((float)num1);
        System.out.println((char)65);
        System.out.println();




    }
}
