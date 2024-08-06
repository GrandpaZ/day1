package Z_Java_Day_to_Day.day8_casting_scanner;

public class CastingExamples {

    public static void main(String[] args){

        byte num1=100;
        short num2=100;
        int num3=num1;
        int num4=1000;
        long num5=num4;
        float num6=124.6F;
        double num7=num6;

        int num8 =3456;
        double num9=num8;

        System.out.println(num8);
        System.out.println("\n\t Num 9 = "+ num8);

        int num10=22;
        byte num11=(byte)num10;
        short num12=(short)num10;
        System.out.println("\n\t Number 10 = "+num10);
        System.out.println("\n\t Number 11 = "+num11);
        System.out.println("\n\t Number 12 = "+num12);


        double num13=55.3d;
        float num14=(float)num13;
        System.out.println("\n\t Number 13 = "+num13);
        System.out.println("\n\t Number 14 = "+num14);

        double num15=1234.5d;
        int num16=(int)num15;
        System.out.println("\n\t Number 15 = "+num15);
        System.out.println("\n\t Number 16 = "+num16);

        int num17=300;
        byte num18=(byte)num17;
        System.out.println("\n\t Number 17 = "+num17);
        System.out.println("\n\t Number 18 = "+num18);

        char letter='Z';
        int numLetter=letter;

        System.out.println("\n\t Letter = "+letter);
        System.out.println("\n\t Non Letter = "+numLetter);

        char letter1='A';
        int numLetter2=letter1;

        System.out.println("\n\t Letter 1 = "+letter1);
        System.out.println("\n\t Non Letter 2 = "+numLetter2);

        double dd=10.5d;
        short ff=(short)dd;
        System.out.println("\n\t D D = "+dd);
        System.out.println("\n\t F F = "+ff);


        char letter3='H';
        int numletter3=letter3;
        System.out.println("\n\t Number Letter3 "+numletter3);

    }
}
