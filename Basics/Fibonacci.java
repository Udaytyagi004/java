package Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms:");
        int n = sc.nextInt();
        int count = 0;
        int a = 0;
        int b = 1;
        while(count<=n){
            int c = a + b;
            System.out.print(c + "  ");
            a = b;
            b = c;
            count++;

        }
    }
    
}
