package Z_Java_Day_to_Day.day_41_Array_List_2;

import java.util.ArrayList;

public class Array_List_1 {
    public static void main(String[] args) {
        ArrayList<String> cites = new ArrayList<>();
        cites.add("New York");cites.add("LA");cites.add("Boston");cites.add("SFO");cites.add("San Jose");
        System.out.println(cites);
        System.out.println("Size of the cites lise = "+cites.size());
        System.out.println("First cites is = "+cites.get(0));
        System.out.println("Last cites is = "+cites.get(cites.size()-1));
        System.out.println();
        for (String each : cites){
            System.out.print("City = " +each+", ");
        }
        System.out.println();
        for (int i = 0 ; i<cites.size();i++ ){
            System.out.print(" "+cites.get(i)+" ");
        }
        System.out.println();
        cites.remove(0);
        System.out.println(cites);
        cites.remove("LA");
        System.out.println(cites);
        cites.clear();
        System.out.println(cites);



    }

}
