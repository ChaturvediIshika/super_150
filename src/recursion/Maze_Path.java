package recursion;

public class Maze_Path {
    public static void main(String[] args) {
        int m=3;
        int n=4;
        paths(0,0,m,n,"");
    }
    public static void paths(int r,int c,int m,int n,String ans)
    {
        if(r==m-1 && c==n-1)
        {
            System.out.println(ans);
            return;
        }
        if(r>=m || c>=n)
        {
            return;
        }
        paths(r+1,c,m,n,ans+"v ");
        paths(r+1,c+1,m,n,ans+"d ");
        paths(r,c+1,m,n,ans+"h ");
    }
}
