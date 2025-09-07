package Bitwise_operator;
// finding the no of digits in any number n , with base b(no. system)
public class no_of_digits {
 public static void main(String[] args) {
    int n = 354;
    int b = 2;  // let's find the no. of digits in binary representation of n
    int ans = (int)(Math.log(n)/Math.log(b) + 1);
    System.out.println(ans);

 }
    
}
