package Bitwise_operator;
// set the ith bit (i.e. if ith  bit is 0 make it 1)
public class Set_bit {
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Integer.toBinaryString((n)));
        int  i = 1;
        // set the i_th bit
        int ans1 = n | (1 << i);

        // Reset the i_th bit
        int ans = n & (~(1 << i));
        System.out.println(Integer.toBinaryString(ans));
    }
}
