package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q_17 {
    
    public static void main(String[] args) {
        
    }
     public List<String> letterCombinations(String digits) {
        return helper("" , digits);
        
    }
    public ArrayList<String> helper(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char  ch = up.charAt(0);
        char[] arr = helper2(ch);
        for(char choice : arr){
            
          ArrayList<String> belList =   helper(p + choice , up.substring(1));
          list.addAll(belList);
           
        }
        return list;
    }
    public char[] helper2(char c){
      return  switch(c){
            case '2' -> new char[]{'a' ,'b' , 'c'};
            case '3' -> new char[]{'d' ,'e' , 'f'};
            case '4' -> new char[]{'g' ,'h' , 'i'};
            case '5' -> new char[]{'j' ,'k' , 'l'};
            case '6' -> new char[]{'m' ,'n' , 'o'};
            case '7' -> new char[]{'p' ,'q' , 'r', 's'};
            case '8' -> new char[]{'t' ,'u' , 'v'};
            case '9' -> new char[]{'w' ,'x' , 'y' , 'z'};
            default -> new char[]{};
        };
    }

}
