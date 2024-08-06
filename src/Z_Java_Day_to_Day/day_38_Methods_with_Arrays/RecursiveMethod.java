package Z_Java_Day_to_Day.day_38_Methods_with_Arrays;

public class RecursiveMethod {
    public static void main(String[] args) {
printNums(1);
    }
    public static void printNums(int num){
        System.out.print(num+" ");
        num++;
if (num<=100){
    printNums(num);

}
    }
}
