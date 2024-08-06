package Z_Java_Day_to_Day.day_42_Array_List_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_util_2 {
    public static void main(String[] args) {


    List<Integer> numbers = Arrays.asList(23,444,12,512,1232,543,223,2,3,2);
        System.out.println(" numbers = "+numbers);
        System.out.println(" numbers size = "+numbers.size());
        Collections.sort(numbers);
        System.out.println(" numbers after sorting = "+ numbers);
        System.out.println(" Max numbers = "+Collections.max(numbers));
        System.out.println(" Min numbers = "+Collections.min(numbers));
        System.out.println(" count of frequency 2 = "+Collections.frequency(numbers,2));
        Collections.shuffle(numbers);
        System.out.println("after shuffle = "+numbers);




}}
