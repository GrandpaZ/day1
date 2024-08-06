package test;

public class find {
//from "abcdac" to "abcd"

    public static String removeDuplicate_char_in_String(String input){
        String cleanString ="";
        for (int i=0;i<input.length();i++){
           int count=0;
           if (input.charAt(count)!=input.charAt(i)){
               cleanString+=input.charAt(count);}

        }

        return cleanString;
    }








}
