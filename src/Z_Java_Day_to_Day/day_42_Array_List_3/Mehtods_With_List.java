package Z_Java_Day_to_Day.day_42_Array_List_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mehtods_With_List {
    public static void printStringList(List<String> stringList){
        for (String str : stringList){
            System.out.print(str+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
             List<String> words = new ArrayList<>();
             words.add("java");words.add("html");words.add("selenium");words.add("a");words.add("input");words.add("title");
             printStringList(words);
             System.out.println();
             printStringList(Arrays.asList("select","option","br","python","sql","qpi"));
    }
}