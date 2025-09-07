package Bitwise_operator;

public class Ith_bit {
    public static void main(String[] args) {
        int num = 26;
        int ans_4th_bit = (num & (1 << 3));
        System.out.print(ans_4th_bit);

    }
    
}
