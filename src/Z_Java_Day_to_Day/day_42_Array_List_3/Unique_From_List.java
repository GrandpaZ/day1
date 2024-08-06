package Z_Java_Day_to_Day.day_42_Array_List_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unique_From_List {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2,5,4,3,2,1,25,5));
        System.out.println(nums);
        List<Integer> uniqueList = new ArrayList<>();
        for (int num:nums){
            if (Collections.frequency(nums,num)==1){
                System.out.print(num+" ");
                uniqueList.add(num);

            }
        }
        System.out.println("\n uniqueList = "+uniqueList);






    }
}
