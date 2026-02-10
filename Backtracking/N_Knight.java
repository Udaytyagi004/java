package Backtracking;

public class N_Knight {
     public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        int a = knights(board , 0 , 0 , 4);
        System.out.println(a);
        
        
    }
    
    
    public static int knights(boolean[][] board , int row , int col, int kn){
        if(kn == 0){
        //   display(board);
        //   System.out.println();
            return 1;
        }
        int count = 0;
        if(row == board.length){
            return 0;
        }
        if(col == board.length){
            return knights(board , row+1 , 0, kn);
        }
        if(is_safe(board , row , col)){
            board[row][col] = true;
            count += knights(board ,  row , col+1 , kn-1);
            board[row][col] = false;
        }
        count += knights(board, row , col+1 , kn);
        return count;
    }
    public static boolean is_safe(boolean[][] board , int row , int col){
        if(is_valid(board ,row-2 , col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
         if(is_valid(board,row-2 , col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
         if(is_valid(board,row-1 , col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
         if(is_valid(board,row-1 , col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }
    public static boolean is_valid(boolean[][] board ,  int row , int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }
    public static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean cell : row){
                if(cell){
                    System.out.print("K ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
    
}

