import java.util.*;

public class App{
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //column
        for(int i=0; i<9;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        
        //row
        for(int j=0;j<9;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        //grid
        int sr=(row/3)*3;
        int sc=(row/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }

        int nextRow=row, nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]);    
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello, World! \nMy name is Sk Mainul Alam :) \n I am currently a student of Jadavpur University");
        System.out.println("I am making this sudoku_solver so that we can solve sudoku easily by this algorithm, without scratching our head and wasting  a big time!");
        int sudoku[][]=new int[9][9];
        System.out.println("Give me the sudoku rowwise. Strike enter after every number, and for empty places, give zero(0) as input.");
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                sudoku[i][j]=sc.nextInt();
            }
        }
        System.out.println("So, the problem is this:");
        printSudoku(sudoku);
        System.out.println("And here we go for the answer:");
        if(sudokuSolver(sudoku,0,0)){
            System.out.println("Solution Exists!");
            printSudoku(sudoku);
        }else{
            System.out.println("Solution doesn't exists!!!");
        }
    }
}
