package Backtracking;

import java.util.Scanner;

public class N_Knights {
    static int z=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean board[][]=new boolean[n][n];
        knight(board,n,0,0,n);
        System.out.println("\n"+z);
    }
    public static void knight(boolean board[][],int tk,int row,int col,int n)
    {
        int c;
        if(tk==0)
        {
            z++;
            display(board);
            return;
        }
        for(int r=row;r< board.length;r++)
        {
            if(r==row)
                c = col;
            else
                c = 0;
            for (; c < board.length; c++) {
                if (isSafe(board, r, c)) {
                    board[r][c] = true;
                    knight(board, tk - 1, r, c+1, n);
                    board[r][c] = false;
                }
            }
        }
    }
    public static void display(boolean board[][])
    {
        for (int i=0;i<board.length;i++)
        {
            for(int j=0;j< board[0].length;j++)
            {
                if(board[i][j]==true)
                    System.out.print("{"+i+"-"+j+"} ");
            }
        }
        System.out.print(" ");
    }
    public static boolean isSafe(boolean board[][],int row,int col)
    {
        if(row>0 && col>1 && board[row-1][col-2])
            return false;
        if(row>0 && col+2< board.length && board[row-1][col+2])
            return false;
        if(row>1 && col>0 && board[row-2][col-1])
            return false;
        if(row>1 && col+1< board.length && board[row-2][col+1])
            return false;
        return true;
    }
}
