package Z_Java_Day_to_Day.day_35_methods_;

public class Email_ {
    public static void main(String[] args) {
buildEmail("hi","how are you");
    }
    public static void buildEmail(String name,String domain){
        name = name.replace(" ","_").toLowerCase();
        domain = domain.replace(" ","_").toLowerCase();
        System.out.println("Your email address is : \n\t"+name+"@"+domain+".com");
    }
}
