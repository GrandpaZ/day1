package Z_Java_Day_to_Day.day_31_A_rrays_2;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
      int[] num={1,22,33,44,55,66,88,99};

        System.out.println(Arrays.binarySearch(num,22));
        System.out.println(Arrays.binarySearch(num,1));
        System.out.println(Arrays.binarySearch(num,55));
        System.out.println(Arrays.binarySearch(num,88));

        if (Arrays.binarySearch(num,99)>=0 ){
            System.out.println(" 99 is present in array");
        }else{
            System.out.println(" 99 is not present in array");
        }





    }
}
