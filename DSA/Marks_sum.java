package DSA;

import java.util.Arrays;

public class Marks_sum {

    public static void main(String[] args) {
        int[] marks = {80,70,60,50,40,30,20};
        int sum = 0;
        for(int i =0; i<5; i++){
            sum += marks[i];

        } 
         System.out.println(sum); 
        for(int i = marks.length-5;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
          
    }
    public static int[] sort(int[] arr){
        for(int i =0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;

    }
    
}
