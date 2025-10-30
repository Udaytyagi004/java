package Recursion_Easy;

public class Print_no {
    public static void main(String[] args){
        // Print_n(5);
        System.out.println("Printing in reverse order");
        // Print_rev(5);
        fun(0 ,5);

    }
    static void fun(int i , int n){
       System.out.println(i);
        if(i == n) return;
        fun(i+1 , n);
    }

    //    // this recursive function will print number from 1 to n

    static void Print_n(int n){
        if(n == 0 ) return;
            
        Print_n(n-1);
        System.out.println(n);
        
    }

    // this recursive function will print number from n to 1
    static void Print_rev(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Print_rev(n-1);
    }
}
