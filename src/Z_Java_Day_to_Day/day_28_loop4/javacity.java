package Z_Java_Day_to_Day.day_28_loop4;

public class javacity {
    public static void main(String[] args) {
        int totalClass = 0;
        int loopDay = 1;
        for (loopDay = 0; loopDay <= 30; loopDay++) {
            if (loopDay % 7 == 0) {
                totalClass += 500;
            } else {
                totalClass += 200;
                System.out.println("day " + loopDay + " dailyClass " + totalClass);


            }
        }
    }}
