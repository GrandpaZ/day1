package Z_Java_Day_to_Day.day_14_Multi_branch;

import java.util.ArrayList;
import java.util.List;

public class multi_branch {
    public static void main(String[] args) {
//        int num=10; //primitiveType
//        Integer IntegerNum=20; //Wrapper class
//        System.out.println(num);
//        System.out.println(IntegerNum);
//        int result=IntegerNum;
//        System.out.println(result);

        System.out.println("===================================");
        //because we wanna store people's name, we used StringList that can only hold String type
        List <String> nameList = new ArrayList<>();
        nameList.add("Zach");
        nameList.add("Jhon");
        nameList.add("Xax");
        System.out.println(nameList);

        //because we wanna store people's age, we used intList that can only hold int type
        //int is primitive, Collection Type does not deal with primitiveType
        //we have to use Wrapper Class Integer
        System.out.println("===================================");
        List<Integer>age=new ArrayList<>();
        age.add(24);
        age.add(25);
        age.add(30);
        System.out.println(age);

        System.out.println("===================================");
        List<Double>salary=new ArrayList<>();
        salary.add(120000.0);
        salary.add(180000.5);
        salary.add(2550000D);
        System.out.println(salary);

    }




}
