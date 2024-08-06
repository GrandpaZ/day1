package N_Java_Day_to_Day.day_53_CustomExceptions;

public class BreaktimeException extends RuntimeException {//become custom unchecked exceptions

    public BreaktimeException() {
        super("Time to go home");
        System.out.println("It's time for a break");
    }

    public BreaktimeException(String str) {
        super(str);
        System.out.println("time for 15 mins break");
    }
}
class test{
    public static void main(String[] args) {
        //throw new RuntimeException("This is runtime exceptions");
        throw new BreaktimeException("you need give me a break");
    }
}