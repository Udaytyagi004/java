package Bitwise_operator;
public class XOR_of_no_in_a_range{
    public static void main(String[] args) {
        // find XOR of all the numbers between a and b
        int a = 3;
        int b = 9;
        int ans = Calculate_XOR(9) ^ Calculate_XOR(2);
        System.out.println(ans);

    }
    static  int Calculate_XOR(int n){
        if(n % 4 == 0) return n;
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n+1;
        
        return 0;
    }

}