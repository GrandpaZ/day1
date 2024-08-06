package Z_Java_Day_to_Day.day_24_Loop;

public class Result__ {
    public static void main(String[] args) {
        String str="1233211234567";
        String result = "";
        for (int i =0;i<=str.length()-1;i++){
            String s =""+str.charAt(i);
            if (!result.contains(s)){
                result+=s;
            }

        }
        System.out.println(result+" = result ");






    }
}
