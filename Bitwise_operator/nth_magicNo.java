package Bitwise_operator;

public class nth_magicNo {
    public static void main(String[] args) {
        int i = 1;
        int num = 16;
        int ans = 0;
        while(num != 0){
            int last_bit = num & 1;
            ans += (int)(last_bit * Math.pow(5,i));
            num = num >> 1;
            i++;

        }
        System.out.println(ans);
    }
    
}
