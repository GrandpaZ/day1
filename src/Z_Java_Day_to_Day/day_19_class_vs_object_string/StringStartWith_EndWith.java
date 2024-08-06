package Z_Java_Day_to_Day.day_19_class_vs_object_string;

public class StringStartWith_EndWith {
    public static void main(String[] args) {
        String u="wulumuqi";
        System.out.println(u.startsWith("w"));
        System.out.println(u.startsWith("wulumuq"));
        System.out.println(u.startsWith("i"));
        System.out.println("=========================");
        System.out.println(u.endsWith("i"));
        System.out.println(u.endsWith("ulumuqi"));
        System.out.println(u.endsWith("w"));

    }
}
