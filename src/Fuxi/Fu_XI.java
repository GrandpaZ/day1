package Fuxi;

public class Fu_XI {
static int[] get(){
    return new int[]{};
}

    public static void main(String[] args) {

        //declaring a source array
        int arr[] = { 3, 1, 2, 5, 4 };

        // passing array to method m1
        sum(arr);
    }
    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }



        }
