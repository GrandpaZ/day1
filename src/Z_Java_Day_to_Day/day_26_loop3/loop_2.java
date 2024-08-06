package Z_Java_Day_to_Day.day_26_loop3;

public class loop_2 {
    public static void main(String[] args) {
        String word="Hello";
        char letter='l';
        int count=0;
        for (int i=0;i<word.length();i++){
            if(word.charAt(i)==letter){
                count++;
            }
        }
        System.out.println("There are "+count+" "+letter+"\'s in " + word);
    }
}
