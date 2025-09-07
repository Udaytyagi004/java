package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q_1431 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));

        
    }
     static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> ans = new ArrayList<>();
       for(int i = 0; i< candies.length; i++){
        boolean result = Compare(i,extraCandies, candies);
        ans.add(result);
       }
       return ans;
       
        
    }
   static boolean Compare(int i, int n, int[] candies){
    candies[i] += n;
    int max = candies[i];
    for(int j = 0; j< candies.length; j++){
        if(candies[j] > max){
            return false;
        }

    }
    return true;
   }
    
}
