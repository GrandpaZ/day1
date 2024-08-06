package Z_Java_Day_to_Day.day_42_Array_List_3;

import java.util.Arrays;
import java.util.List;

public class Methods_ {
    public static int sumIntegerList(List<Integer> list) {
       int sum = 0;
       for (int i : list){
           sum += i;
       }
       return sum;
    }
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(23,21,3,23,255,23212,211,34,5);
        System.out.println(nums);
        int sum = sumIntegerList(nums);
        System.out.println(" sum = "+sum);

    }
}
