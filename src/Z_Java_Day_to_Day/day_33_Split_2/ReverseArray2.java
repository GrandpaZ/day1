package Z_Java_Day_to_Day.day_33_Split_2;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] numArry={6,8,16,5};
        System.out.println("\n\tBefore Swap "+ Arrays.toString(numArry));
        int temp=numArry[0];
        numArry[0]=numArry[3];
        numArry[3]=temp;
        System.out.println("\t\n After Swap "+Arrays.toString(numArry));
        System.out.println("=======================================");
        System.out.println(numArry.length);
        System.out.println("=======================================");
//        for (int i = 0, j = numArry.length-1;i < numArry.length;i++,j--){
//            int num1=numArry[j];
//            System.out.println(num1);
//        }
        int []result=new int[numArry.length];
        for (int i = numArry.length-1, j=0; i>=0;j++,i--) {
            result[j]=numArry[i];
        }
       System.out.println(Arrays.toString(result));










    }
}
