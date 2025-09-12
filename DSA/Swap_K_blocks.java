package DSA;

import java.util.Arrays;

public class Swap_K_blocks {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
        int k = 3;


        int j = 0;
        int i ;
        while(j < nums.length){
            
            for( i = j; i<j+k ;i++){
                int temp = nums[i];
                nums[i] = nums[i+k];
                nums[i+k] = temp;
            }
            j = 2*k +j;
        }
        System.out.println(Arrays.toString(nums));
        
    }
    
}
