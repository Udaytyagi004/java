package Maze_Problems;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countPaths(3, 3));
        
    }
    public static int countPaths(int n, int m){
        if(n == 1 || m == 1) return 1;
        return countPaths(n-1, m) + countPaths(n, m-1);
    } 
    
    public static void printPath(String p , int n , int m){
        if(n == 1 && m == 1){
            System.out.println(p);
        }
        if(n > 1) printPath(p+'D' , n-1 , m);
        if(m > 1) printPath(p + 'R' , n ,m-1);
    }
     public static ArrayList<String> returnPath(String p , int n , int m){
        if(n == 1 && m == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(n > 1) {
            ArrayList<String> leftList = returnPath(p+'D' , n-1 , m);
            list.addAll(leftList);
        }
        if(m > 1){
             ArrayList<String> rightList = returnPath(p + 'R' , n ,m-1);
             list.addAll(rightList);
        }
            
            return list;
            
            
        
    }



    // if diagonal moiton is also allowed 
     
      public static int countPaths2(int n, int m){
        if(n == 1 || m == 1) return 1;
        return countPaths2(n-1, m) + countPaths2(n, m-1) + countPaths2(n-1 ,m -1);
    }
    
    
    
    public static ArrayList<String> returnDiaPath(String p, int n, int m){
        if(n == 1 && m == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(n > 1 && m > 1){
            list.addAll(returnDiaPath(p+ 'x' , n-1 , m - 1));
        }
        
        if(n > 1) {
            ArrayList<String> leftList = returnDiaPath(p+'D' , n-1 , m);
            list.addAll(leftList);
        }
        if(m > 1){
             ArrayList<String> rightList = returnDiaPath(p + 'R' , n ,m-1);
             list.addAll(rightList);
        }
        return list;
    }
    
}
