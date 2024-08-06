package Z_Java_Day_to_Day.day_41_Array_List_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_List {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        numbers.add(2);numbers.add(123);numbers.add(585);numbers.add(77);
        System.out.println(" Before sorting = "+numbers);
        Collections.sort(numbers);
        System.out.println(" After sorting = "+numbers);
    }
}
