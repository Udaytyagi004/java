package Maze_Problems;

import java.util.ArrayList;
// maze problem with obstacle 
// let in 3x3 matrix obstacle is placed at (2,2)
public class MazeWithObstacle {
    public static void main(String[] args) {
        System.out.println(countPath(3,3));
        System.out.println( printPath("", 3, 3));
        
    }
     public static int countPath(int r , int c){
        if(r == 1 || c == 1) return 1;
        if(r == 2 && c == 2) return 0;
        
        return countPath(r-1 , c) + countPath(r ,c-1) + countPath(r-1 ,c-1);
    }
    public static ArrayList<String> printPath(String p , int r , int c){
        if(r== 1 && c== 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // this condition is for the obstacle
        if(r == 2 && c == 2){
             ArrayList<String> list = new ArrayList<>();
             return list;
        }
        ArrayList<String> list = new ArrayList<>();

        //for the diagonal path
        if(r > 1 && c > 1){
            list.addAll(printPath(p+"X" , r - 1, c - 1));
        }
        if(r > 1){
            list.addAll(printPath(p+'D' , r -1 , c));
        }
        if(c > 1){
            list.addAll(printPath(p + 'R' , r , c - 1));
        }
        return list;
    }
    

// Taking the maze as a boolean Matrix and in it if maze[r][c] == false that means obstacle is placed at that place 

    public static ArrayList<String> retPath( boolean[][] maze ,String p , int r , int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // this condition is for the obstacle
        if(!maze[r][c]){
             return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();

        //for the diagonal path
        if(r < maze.length - 1 && c < maze[0].length - 1){
            list.addAll(retPath(maze ,p+"X" , r + 1, c + 1));
        }
        if(r < maze.length - 1){
            list.addAll(retPath(maze , p+'D' , r + 1 , c));
        }
        if(c < maze[0].length - 1){
            list.addAll(retPath(maze , p + 'R' , r , c + 1));
        }
        return list;
    }
    
}
