package Z_Java_Day_to_Day.day_19_class_vs_object_string;

public class checkCaseMatch {
    public static void main(String[] args) {
        String word="Hello";
        String uword=word.toUpperCase();
        if (word.equals(uword)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

    }
}
