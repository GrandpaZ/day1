package Z_Java_Day_to_Day.day_37_methods_overloading;

public class RepeatString {
    public static void main(String[] args) {
        System.out.println(repeatString("Hi ",3,'|'));
    }
    public static String repeatString(String a,int b,char c){
        String retValue="";
        for (int i=1;i<=b;i++){
            if (i==b){
                retValue+=a;
            }else {
                retValue+=a+c;
            }
        }
        return retValue;
    }
}
