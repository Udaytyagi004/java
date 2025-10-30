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
     public static void print_star(int row , int col){
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

      //recursive bubble sort
    public static void bubble_sort(int[] arr , int r , int c){
        if(r == 0) return;
        if(c<r){
            if(arr[c] >arr[c+1]){
                swap(arr , c , c+1);
            }
            sort(arr , r , c+1);
            
        }else{
            sort(arr ,--r , 0);
        }
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // recursive selection sort 
    public static void sort(int[] arr , int r , int c , int max){
        if(r == 0) return;
     
        if(c<=r){
            if(arr[c] >arr[max]){
               max = c;
            }
            sort(arr , r , c+1 , max);
            
        }else{
           swap(arr , max , r);
           sort(arr , r-1 , 0 , 0);
        }
    }
}
