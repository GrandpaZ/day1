package Z_Java_Day_to_Day.day_23_String_manipulation4;

public class message___ {
    public static void main(String[] args) {
        String message=" | abu :[Iphone] From {123-321-1234} (Hi, How are you ? Hope you doing Well) ";
        String name=message.substring((message.indexOf("|")+2),message.indexOf(":"));
        String device=message.substring((message.indexOf("[")+1),(message.indexOf("]")));
        String phoneNumber=message.substring((message.indexOf("{")+1),message.indexOf("}"));
        String whatDidHeSaid=message.substring((message.indexOf("(")+1),message.indexOf(")"));
        System.out.println(" Name  : "+name);
        System.out.println(" Device : "+device);
        System.out.println(" Phone number  : "+phoneNumber);
        System.out.println(" What did he say  : "+whatDidHeSaid);
        String message1=message.trim();
        System.out.println(message1);




    }
}
