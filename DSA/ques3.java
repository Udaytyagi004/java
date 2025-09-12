package DSA;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the No. of Students : ");
        int n =in.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int min = Integer.MAX_VALUE;
        int total = 0;
        for(int i =0 ; i<n;i++){
            arr[i] = in.nextInt();
            total += arr[i];
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Max MArks : " + max + "min marks: "+ min + "average : " + (total/n) + "total : " + total);
    }
    
}
