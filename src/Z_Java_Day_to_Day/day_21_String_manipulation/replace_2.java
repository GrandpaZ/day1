package Z_Java_Day_to_Day.day_21_String_manipulation;

public class replace_2 {
    public static void main(String[] args) {
        String word1="java";
        String word2=word1.replace("java","selenium");
        System.out.println("word 2 - "+word2);
        String word3="fun";
        String word4=word3.replace("fun"," is so much fun ");
        System.out.println("word 4 - "+word4 );
        System.out.println("------------------------------");
        String result = "1-48 over 4000 result for java book ";
        String result1= result.replace("1-48 over ","");
        String result2=result1.replace(" result for java book ","");
        System.out.println(" result - "+result2);

    }
}
