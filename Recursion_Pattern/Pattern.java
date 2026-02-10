package Recursion_Pattern;

public class Pattern {
    public static void main(String[] args) {
        
    }
     // *
     // **
     // ***
     // ****
     public static void print_star(int row , int col){
        if(row == 0) return;
        
        if(col < row){
            
            print_star(row , col+1);
            System.out.print("*");
        } 
        if(row == col){
            
            print_star(row - 1 , 0);
            System.out.println();
        } 
    }
    // *****
    // ****
    // ***
    // **
    // *
     public static void print_star2(int row , int col){
        if(row == 0) return;
        
        if(col < row){
             System.out.print("*");
            print_star(row , col+1);
           
        } 
        if(row == col){
            System.out.println();
            print_star(row - 1 , 0);
            
        } 
    }

   
}
