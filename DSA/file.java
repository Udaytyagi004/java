package DSA;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int n =10;

        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
           
        }
        for(int i =0;i<n;i++){
            if(i %2 == 0){
                System.out.print(arr[i] + " ");
            }
           
        }
    }
    
}
