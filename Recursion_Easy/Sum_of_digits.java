package Recursion_Easy;

public class Sum_of_digits {
    public static void main(String[] args) {
        System.out.println(rev1(456));
        // fun(5);
        
    }
    public static int sum(int  n){
        if(n == 0) return 0;
        return (n%10) + sum(n/10);
 
    }
    // static void fun (int n){
    //     if(n == 0) return;
    //     System.out.println(n);
    //     fun(n--);
    // }



// reverse a number using recursion
    static int rev(int n){
        if(n%10 == n)  return n;
        return  (n%10) *(int)(Math.pow(10,(int)(Math.log10(n)))) + rev(n/10);
    }

    // in case where we need extra variable , we can create a helper function
    static int rev1(int n){
        int digits = (int)(Math.log10(n));
        return helper(n, digits);
    }
    private static int helper(int n , int digits){
        if(n % 10 == n) return n;
        return (n % 10) *(int)(Math.pow(10,digits)) + helper(n/10,digits -1);
    }
    
}
