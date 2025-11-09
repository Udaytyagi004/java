package Interview_Ques;

import java.util.ArrayList;

// in how many ways we can make a 4 out of the numbers appear on the face of the dice
//Example here target = 4
public class DiceProblem {
    
    public static void main(String[] args) {
           
        System.out.print( helper("" , 4 ));
    }
      public static  ArrayList<String> helper(String ans , int target ){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target ; i++){
            
                list.addAll(helper(ans + i, target - i));
         }
        return list;
    }
}
