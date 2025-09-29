package Recursion_String;

public class Subsets {
    public static void main(String[] args) {
        subsets("", "abc");
        
    }
    public static void subsets(String ans , String str){

        if(str.isEmpty()){
            System.out.print(ans + " ");
            return;
        }
      subsets(ans + str.charAt(0) , str.substring(1));
       subsets( ans , str.substring(1));
    }
    
}
