package Z_Java_Day_to_Day.day_43_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class  Method_With_List_return {
    public static List<Integer> getIntergerList(){
        List<Integer> nums = new ArrayList<>();
        for (int i =0; i<1_000_000;i++){
            nums.add(i);
        }return nums;
    }
    public static void main(String[] args) {
        List<Integer> mlnNums=getIntergerList();
        System.out.println(getIntergerList());


    }
}
