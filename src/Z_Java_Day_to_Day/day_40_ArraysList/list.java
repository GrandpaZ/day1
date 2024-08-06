package Z_Java_Day_to_Day.day_40_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        System.out.println(num);
        num.add(213);num.add(23);num.add(233);num.add(123);num.add(12412);
        System.out.println("the size of Array list = "+num.size());
        System.out.println(num);
        num.remove(0);
        System.out.println();
        num.remove(new Integer(123));
        System.out.println(num);
        System.out.println();
        for (int i=0;i<num.size();i++){
            System.out.print(num.get(i));
        }
        for (int each : num){
            System.out.print(each+" ");
        }
    }
}
