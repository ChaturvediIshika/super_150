package Backtracking;

public class queen_combination {
    public static void main(String[] args) {
        int n=4;
        int q=2;
        boolean board[]=new boolean[n];
        combination(board,q,0,"",0);
    }
    public static void combination(boolean board[],int q,int qno,String ans,int idx)
    {
        if(qno==q){
            System.out.println(ans);
            return;
        }
        for (int i=idx;i< board.length;i++)
        {
            if (board[i]==false)
            {
                board[i]=true;
                combination(board,q,qno+1,ans+"b"+i+"q"+qno,i+1);
                if(qno!=0)
                    board[i]=false;
            }
        }
    }
}
