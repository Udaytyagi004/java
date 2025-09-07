package Bitwise_operator;

import java.util.Scanner;

// find whether a number is of power of 2 or not
public class Power_of_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
      
        if((num & (num-1)) == 0){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
    
}
