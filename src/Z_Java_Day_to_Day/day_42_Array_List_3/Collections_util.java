package Z_Java_Day_to_Day.day_42_Array_List_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_util {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('a','b','n','y','c','r','m','t','a'));
        System.out.println(" Letters before sorting = "+letters);
        Collections.sort(letters);
        System.out.println(" letter after sorting = "+letters);
        System.out.println(" letter size = "+letters.size());
        Collections.reverse(letters);
        System.out.println(" after reversed = "+letters);
        System.out.println(" How many a in the letters = "+Collections.frequency(letters,'a'));
        System.out.println(" Max Char = "+Collections.max(letters));
        System.out.println(" Min Char = "+Collections.min(letters));
        Collections.replaceAll(letters,'a','f');
        System.out.println(" after replace all = "+letters);


    }
}
