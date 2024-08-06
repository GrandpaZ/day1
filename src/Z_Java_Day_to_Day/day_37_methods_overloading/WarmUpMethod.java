package Z_Java_Day_to_Day.day_37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("asdas","sadsdsa");
    }
    public static void loginVoid(String username, String password){
        String secreUsername="cybertekStudent";
        String secretPassword="abc123";
        if (username.equalsIgnoreCase(secreUsername)&&secretPassword.equals(secretPassword)){
            System.out.println("\n\tLogin Successful , Welcome Cyber tek Student");
        }else {
            System.out.println("\n\tIncorrect username or password ");
        }
    }
}
