package N_Java_Day_to_Day.day_53_CustomExceptions;

import javax.xml.namespace.QName;

public class InvalidBrowserNameException extends RuntimeException {
    public InvalidBrowserNameException(){
        super("Invalid Browser Name");
    }
    public InvalidBrowserNameException(String str){
        super(str);
        System.out.println("Are you kidding ?");
        System.out.println("That is not a valid Browser name");
    }
}

class Test2{
    public static void main(String[] args) {
        String name="cybertek";
switch ((name.toLowerCase())){
    case "chrome":
        System.out.println("Chrome is selected");
        break;
    case "firefox":
        System.out.println("Fire Fox is selected");
        break;
    case "safari":
        System.out.println("Safari si selected");
        break;
    default:
        throw new InvalidBrowserNameException(" Please enter a valid browser name ");
}
//        throw new InvalidBrowserNameException();




    }
}
