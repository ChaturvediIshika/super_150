package recursion;

public class Chessboard_Problem {
    static int c=0;
    public static void main(String[] args) {
        int n=3;
        path(n,0,0,"");
        System.out.println(c);
    }
    public static void path(int n,int i,int j,String ans) {
        if (i < 0 || j < 0 || i >= n || j >= n) {
            return;
        }
        if(i==n-1 && j==n-1)
        {
            System.out.println(ans+"{"+i+"-"+j+"}");
            c++;
            return;
        }
// Knight
        path(n, i + 2, j + 1,ans+"{"+i+"-"+j+"}K ");

        path(n, i + 1, j + 2,ans+"{"+i+"-"+j+"}K ");
        //Rook
        if(i==0 || j==0||i==n-1 || j==n-1)
        {
            for (int k=1;k<n;k++)
            {
                path(n,i+k,j,ans+"{"+i+"-"+j+"}R ");
                path(n,i,j+k,ans+"{"+i+"-"+j+"}R ");
            }
        }
        //Bishop
        if(i==j || i+j==n-1)
        {
            for (int t=1;t<n;t++)
            path(n,i+t,j+t,ans+"{"+i+"-"+j+"}B ");
        }
    }
}
