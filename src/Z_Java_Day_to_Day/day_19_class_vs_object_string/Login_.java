package Z_Java_Day_to_Day.day_19_class_vs_object_string;

public class Login_ {
    public static void main(String []args){
        String userName ="u";
        String passWord ="Li123";

        if (userName.equalsIgnoreCase("zu")&&passWord.equals("Li123")){
            System.out.println(" you can login ");
        }else{
            if (!userName.equals("zu")){
                System.out.println("wrong username");
            }else {
                System.out.println("wrong password");
            }
        }






    }
}
