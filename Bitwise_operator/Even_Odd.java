package Bitwise_operator;

import java.util.Scanner;

// finding whether a number is even or odd by using bitwise operator
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        if((n&1) == 1){
            System.out.println("odd");
 }else{
            System.out.println("Even");
        }
    }
}
