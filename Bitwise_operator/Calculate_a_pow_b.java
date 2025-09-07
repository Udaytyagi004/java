package Bitwise_operator;

public class Calculate_a_pow_b {
    public static void main(String[] args) {
        int n = 6;
        int base = 5;
        int ans = 1;
        while(n != 0){
          if((n & 1) == 1){
             ans *= base;
           
          }
          base = base * base;
          n = n>>1;

        }
        System.out.print(ans);
    }
    
}
