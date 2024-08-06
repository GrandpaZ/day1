package Z_Java_Day_to_Day.day_38_Methods_with_Arrays;

public class String_Utils {
    public static void main(String[] args) {
        isNull0rEmpty("");
        String word="";
        isNull0rEmpty(word);
        isNull0rEmpty("sb");
        isNull0rEmpty("Hiii");




    }
    public static void isNull0rEmpty(String str){
        if (str.isEmpty()||str==null){
            System.out.println(str+"  is null or empty");
        }else {
            System.out.println(str+"  is not null or empty");
        }
    }
}
