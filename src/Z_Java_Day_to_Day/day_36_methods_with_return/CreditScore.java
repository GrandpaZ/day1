package Z_Java_Day_to_Day.day_36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(9888);
        checkEligible(22);
        checkEligible(700);
    }
    public static void checkEligible(int creditScore){
        if (creditScore>=700){
            System.out.println("\n\tYou are eligible for leasing this car");
        }else{
            System.out.println("\n\tSorry,you are not eligible for leasing this car");
        }

    }
}
