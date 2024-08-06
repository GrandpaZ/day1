package Z_Java_Day_to_Day.day_33_Split_2;

import java.util.Arrays;

public class MultiDArray_Example {
    public static void main(String[] args) {

        String[][] users = new String[3][2];
        users[0][0] = " Teodora Tsvetanov ";
        users[0][1] = " TeodorasPWD12 ";
        users[1][0] = " Anna Ziyayeva ";
        users[1][1] = " AnnaAlmaty123 ";
        users[2][0] = " Parvin Altee ";
        users[2][1] = " ParvinVienna321 ";

        String[][] userDate = { {"Teodora Tsvetanov"," TeodorasPWD12 "},
                                {" Anna Ziyayeva "," AnnaAlmaty123 "},
                                {" Parvin Altee ", " ParvinVienna321 "}};

        System.out.println(userDate[0][0]);
        System.out.println(userDate[1][0]);
        System.out.println(userDate[2][0]);
        System.out.println(Arrays.deepToString(userDate));
        System.out.println("==============================");
        System.out.println(userDate[0][1]);
        System.out.println(userDate[1][0]);
        System.out.println(userDate[2][0]);
        System.out.println(Arrays.deepToString(userDate));



    }
}
