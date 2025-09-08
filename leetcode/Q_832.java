package leetcode;

import java.util.Arrays;

public class Q_832 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length - 1;
        for(int i = 0; i<=n;i++){
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        
    }
        
    
}
