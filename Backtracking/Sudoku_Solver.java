package Backtracking;

public class Sudoku_Solver {
    public static void main(String[] args) {
         int[][] board = {
           {5,3,0,0,7,0,0,0,0},
           {6,0,0,1,9,5,0,0,0},
           {0,9,8,0,0,0,0,6,0},
           {8,0,0,0,6,0,0,0,3},
           {4,0,0,8,0,3,0,0,1},
           {7,0,0,0,2,0,0,0,6},
           {0,6,0,0,0,0,2,8,0},
           {0,0,0,4,1,9,0,0,5},
           {0,0,0,0,8,0,0,7,9}
       };
       sudoku_solver(board);
    }
    // not taking row and col in the arguments 
     public static void sudoku_solver(int[][] board){    
        int row = -1;
        int col = -1;
        boolean isEmptyLeft = true;
        for(int i = 0; i< 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    isEmptyLeft = false;
                    break;
                }
            }
            if(!isEmptyLeft){
                break;
            }
        }
        if(isEmptyLeft){
            display(board);
            return;
        }
        for(int i = 1 ; i<10;i++){
            if(is_safe(row, col , i , board)){
                board[row][col] = i;
                sudoku_solver(board);
                board[row][col] = 0;
            }
           
        }
    }

// with row and col in the arguments 
     public static void sudoku_solver(int[][] board, int row , int col){    
      if(row == 9){
            display(board);
            return;
        }
        if(col == 9){
            sudoku_solver(board , row + 1 , 0);
            return;
        }
        if(board[row][col] != 0){
            sudoku_solver(board , row , col+1);
            return;
        }
        for(int i = 1 ; i<10;i++){
            if(is_safe(row, col , i , board)){
                board[row][col] = i;
                sudoku_solver(board , row , col);
                board[row][col] = 0;
            }
           
        }
        
    } 

    public static boolean is_safe(int r , int c , int d , int[][] board){
        // row checking
        for(int i = 0 ; i < 9; i++){
            if(board[r][i] == d){
                return false;
               
            }
        }
        // col checking
        for(int i = 0 ; i<9;i++){
            if(board[i][c] == d){
                return false;
                
            }
        }
        // checking the grid 
        int a = r - (r%3);
        int b = c - (c%3);
        for(int i = a; i<a+3;i++){
            for(int j = b ; j<b+3;j++){
                if(board[i][j] == d){
                    return false;
                    
                }
            }
        }
        return true;
    }
    public static void display(int[][] board){
        for(int[] row : board){
            for(int elem : row){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    
}











// public static void sudoku_solver(char[][] board){    
//         int row = -1;
//         int col = -1;
//         boolean isEmptyLeft = true;
//         for(int i = 0; i< 9; i++){
//             for(int j = 0; j < 9; j++){
//                 if(board[i][j] == "."){
//                     row = i;
//                     col = j;
//                     isEmptyLeft = false;
//                     break;
//                 }
//             }
//             if(!isEmptyLeft){
//                 break;
//             }
//         }
//         if(isEmptyLeft){
//             display(board);
//             return;
//         }
//         for(int i = 1 ; i<10;i++){
//             if(is_safe(row, col , char(i) , board)){
//                 board[row][col] = char(i);
//                 sudoku_solver(board);
//                 board[row][col] = ".";
//             }
           
//         }
//     }
//  public static boolean is_safe(int r , int c , char d , char[][] board){
//         // row checking
//         for(int i = 0 ; i < 9; i++){
//             if(board[r][i] == d){
//                 return false;
               
//             }
//         }
//         // col checking
//         for(int i = 0 ; i<9;i++){
//             if(board[i][c] == d){
//                 return false;
                
//             }
//         }
//         // checking the grid 
//         int a = r - (r%3);
//         int b = c - (c%3);
//         for(int i = a; i<a+3;i++){
//             for(int j = b ; j<b+3;j++){
//                 if(board[i][j] == d){
//                     return false;
                    
//                 }
//             }
//         }
//         return true;
//     }
//     public static void display(char[][] board){
//         for(char[] row : board){
//             for(char elem : row){
//                 System.out.print(elem + " ");
//             }
//             System.out.println();
//         }
//     }