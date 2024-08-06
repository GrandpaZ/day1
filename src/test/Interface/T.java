package test.Interface;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;

public class T {
    public static void main(String[] args) {

        ArrayList<Integer> intArrList = new ArrayList<>();
        intArrList.add(1);
        intArrList.add(1);
        intArrList.add(2);
        intArrList.add(2);
        intArrList.add(3);
        intArrList.add(5);
        intArrList.add(5);


        // for Iterating Collection We should not use forLoop and WhileLoop and doWhile Loop

        //Let's remove all even number Using forEachLoop
        for (Integer each : intArrList) {
            if (each % 2 != 0) {
                intArrList.get(intArrList.indexOf(each));
                System.out.println(intArrList.indexOf(each));
            }
        }

    }
}
