package Z_Java_Day_to_Day.day_40_ArraysList;
import java.util.ArrayList;
public class Array_list_ {
    public static void main(String[] args) {
        ArrayList carBrand= new ArrayList();
        carBrand.add("BMW");
        carBrand.add("Dodge");
        carBrand.add("Jeep");
        carBrand.add("Nissan");
        carBrand.add("Honda");
        carBrand.add("Mitsubishi");
        carBrand.add("Toyota");
        carBrand.set(3,"Toyota");
        carBrand.remove(4);
       for (int i = 0 ; i<carBrand.size() ; i++){
           System.out.print(" "+carBrand.get(i));
       }



    }
}
