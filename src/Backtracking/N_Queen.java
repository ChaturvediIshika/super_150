package Backtracking;

public class N_Queen {
    public static void main(String[] args) {
        int n=8;
        boolean[][] board=new boolean[n][n];
        Queen(board,n,0);
    }
    public static void Queen(boolean[][] board,int tq,int row)
    {
        if(tq==0)
        {
            display(board);
            return;
        }
        for(int col=0;col<board.length;col++)
        {
            if(issafe(board,row,col)==true)
            {
                board[row][col]=true;
                Queen(board,tq-1,row+1);
                board[row][col]=false;
            }
        }
    }
    public static void display(boolean[][] board)
    {
        for (int i=0;i<board.length;i++)
        {
            for (int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==true)
                System.out.print("{"+(i+1)+"-"+(j+1)+"} ");
            }
        }
        System.out.println();
    }
    public static boolean issafe(boolean[][] board,int row,int col)
    {
        int r=row;
        while(r>=0)
        {
            if(board[r][col]==true)
                return false;
            r--;
        }
        r=row;
        int c=col;
        while(r>=0 && c>=0)
        {
            if(board[r][c]==true)
                return false;
            c--;
            r--;
        }
        r=row;
        c=col;
        while(r>=0 && c<board[0].length)
        {
            if(board[r][c]==true)
                return false;
            c++;
            r--;
        }
        return true;
    }
}
