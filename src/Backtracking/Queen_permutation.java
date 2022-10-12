package Backtracking;

public class Queen_permutation {
    public static void main(String[] args) {
        int n=4;
        int q=2;
        boolean board[]=new boolean[n];
        Permutation(board,q,0,"");
    }
    public static void Permutation(boolean board[],int q,int qno,String ans)
    {
        if(qno==q){
            System.out.println(ans);
            return;
        }
        for (int i=0;i< board.length;i++)
        {
            if (board[i]==false)
            {
                board[i]=true;
                Permutation(board,q,qno+1,ans+"b"+i+"q"+qno);
                board[i]=false;
            }
        }
    }
}
