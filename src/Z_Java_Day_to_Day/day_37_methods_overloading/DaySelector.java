package Z_Java_Day_to_Day.day_37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(daySelector(7));
        System.out.println(daySelector(2));
        System.out.println(daySelector(0));
    }
    public static String daySelector(int day){
        switch (day){
            case 1:
                return "Monday";
            case 2:return "Tuesday";
            case 3:return "Wednesday";
            case 4:return "Thursday";
            case 5:return "Friday";
            case 6:return "Saturday";
            case 7:return "Sunday";
            default:
                System.out.println("Invalid day - "+day);
                return null;
        }

    }}
