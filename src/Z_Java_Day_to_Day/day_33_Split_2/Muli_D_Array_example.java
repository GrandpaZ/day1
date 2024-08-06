package Z_Java_Day_to_Day.day_33_Split_2;

public class Muli_D_Array_example {
    public static void main(String[] args) {
        int[][] numbers2D = {
                {12,55,4,7},
                {123,555,9},
                {56,87,455,34},
                {234,12,54,23,23}
        };
        System.out.println(" Numbers 2 D [2][2] = "+numbers2D[2][2]);
        System.out.println("===============================");
        for (int row=0 ; row <numbers2D.length;row++){
            for (int j = 0;j<numbers2D[row].length;j++){
            System.out.println(numbers2D[row][j]);
        }








    }
}}
