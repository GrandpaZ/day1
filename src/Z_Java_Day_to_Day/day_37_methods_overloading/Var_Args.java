package Z_Java_Day_to_Day.day_37_methods_overloading;

public class Var_Args {
    public static void main(String[] args) {
        addNumbers(2,3,4,5,6);
    }
    public static void addNumbers(int...nums){
        int sum = 0;
        for (int n :nums){
            sum += n;
        }
        System.out.println(" The Sum =  "+sum);
    }
}
