package LinkedList_Ques;

import java.util.HashSet;

public class HappyNumber {





     public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return helper(n , set);
       
        
    }
    public boolean helper(int n , HashSet<Integer> set){
        if(n == 1) return true;
        int num = 0;
        while(n != 0){
            int dig = n % 10;
            num += dig*dig;
            n /= 10;
        }
        if(set.contains(num)){
            return false;
        }else{
            set.add(num);
        }
        return helper(num , set); 
    }
    
}
