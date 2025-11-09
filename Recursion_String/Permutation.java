package Recursion_String;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");
        
    }
    public static void permutation(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i , p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }


     public static ArrayList<String> permutation2(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i , p.length());
            ArrayList<String> belowList = permutation2(f + ch + s, up.substring(1));
            list.addAll(belowList);
        }
        return list;
    }


    // counting the number of the permutation

     public static int permutationcount(String p , String up){
        if(up.isEmpty()){
           
            return 1;
        }
     int count = 0;
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i , p.length());
             count  = count + permutationcount(f + ch + s, up.substring(1));
            
        }
        return count;
    }

    // passing count in argument

    public static int percount(String p , String up , int count){
        if(up.isEmpty()){
            return  count + 1;
         }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i , p.length());
            count =  percount(f + ch + s, up.substring(1) , count);
            
        }
        return count;
       
    }
}
