package Bitwise_operator;

public class No_of_bits {
    public static void main(String[] args) {
        int count = 0;
        int  n = 16;
        // while(n != 0){
        //     if((n & 1) == 1){
        //         count++;
        //     }
        //     n >>= 1;
        // }

        // other way 
        // while(n >0){
        //     n = n - (n & (-n));
        //     count++;
        // }

        // another way 
        while(n > 0){
            n = n  & (n - 1);
        count++;        }
        System.out.println(count);
    }
    
}
