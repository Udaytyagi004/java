package Recursion_String;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
       System.out.println( subsets2("", "abc"));
        
    }
    public static void subsets(String ans , String str){

        if(str.isEmpty()){
            System.out.print(ans + " ");
            return;
        }
      subsets(ans + str.charAt(0) , str.substring(1));
       subsets( ans , str.substring(1));
    }
      public static ArrayList<String> subsets2(String ans , String str){

        if(str.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(ans);

            return list;
        }
    ArrayList<String> left = subsets2(ans + str.charAt(0) , str.substring(1));
      ArrayList<String> right =  subsets2( ans , str.substring(1));
      left.addAll(right);
      return left;
    }
    
}
