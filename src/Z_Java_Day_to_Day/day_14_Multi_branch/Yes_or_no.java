package Z_Java_Day_to_Day.day_14_Multi_branch;

public class Yes_or_no {
    public static void main(String[] args) {
        System.out.println(" Are you sure you want to delete this file ");
        char selection='f';
        boolean answer;
        if (selection=='y'){
            System.out.println( "your file will be deleted");
            answer = true;
        }else {
            System.out.println(" file deletion cancelled");
            answer=false;
        }

        System.out.println("\n\tdid file get deleted ?");
        System.out.println(answer);





    }
}
