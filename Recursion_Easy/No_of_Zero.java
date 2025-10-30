package Recursion_Easy;
// we have to count the no. of zeros in a number
public class No_of_Zero {
    public static void main(String[] args) {
        System.out.println(noZeros(1020300340));
        System.out.println(helper(1020300340 , 0));
        
    }
    // we require a variable to store the count and have to pass this count to the next recursive call , we can do it by the help of a helper function
    public static int noZeros(int n){
        
        return helper(n,0);
    }

    //otherwise we can pass count itself as an argument to the function ,(then simply call this helper function directely in main with two arguments n and count . initially the count is 0)
    public static int helper(int n, int c){
        if(n == 0) return c;
      
        if(n%10 == 0) c++;
        return helper(n/10, c);
    }
    
}
