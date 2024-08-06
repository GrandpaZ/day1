package Z_Java_Day_to_Day.day_40_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class Shopping_List {
    public static void main(String[] args) {
    List<String> shoppingList=new ArrayList<>();
        System.out.println("size = "+shoppingList.size());
        System.out.println("is empty ? = "+shoppingList.isEmpty());
        shoppingList.add("coke");shoppingList.add("milk");shoppingList.add("water");shoppingList.add("fruit");shoppingList.add("meat");
        if (shoppingList.isEmpty()){
            System.out.println("list is empty , go home ");
        }else{
            System.out.println("list is not empty , go buy it ");
        }
        int count=shoppingList.size();
        System.out.println("total of "+count+" items to buy");
        System.out.println("is coke in my list "+shoppingList.contains("coke"));
}}
