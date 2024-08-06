package Z_Java_Day_to_Day.day_19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {

        String a = "apple";
        System.out.println(a.equals("Apple"));
        System.out.println(a.equalsIgnoreCase("appLe"));
        System.out.println("========================================");
        String expUserName = "abu";
        String expPassWord = "skr";
        String userName = "abu";
        String userPassword = "skr";

        if (expUserName.equalsIgnoreCase(userName) && expPassWord.equalsIgnoreCase(userPassword)) {

            System.out.println(" user log in successfully ");
        } else {
            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("incorrect username");
            }
            if (!expPassWord.equalsIgnoreCase(userPassword)) {
                System.out.println("incorrect password");
            }


        }
    }}