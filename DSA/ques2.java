package DSA;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter  the no. of elements : ");
        int n = in.nextInt();
        System.out.print("Enter the type of elemets");
        String type = in.next();
        
        if(type.equals("int")){
            int[] arr = new int[n];
            int sum = 0;
            for(int i =0;i<n;i++){
                arr[i] = in.nextInt();
                sum += arr[i];
               
            }
            System.out.println("Sum of array elements is : " + sum);    

        }
        if(type.equals("string")){

            String[] arr = new String[n];
            int maxLength = 0;
            for(int i =0;i<n;i++){
                arr[i] = in.next();
                if(arr[i].length() > maxLength){
                    maxLength = arr[i].length();
                }
               
            }
            System.out.println("Max length is: " + maxLength);

        }
    
}
}   
