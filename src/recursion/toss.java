package recursion;

public class toss {
    public static void main(String[] args) {
        int n=3;
        coin_toss(n,"");
    }
    public static void coin_toss(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        coin_toss(n-1,ans+"H");
        coin_toss(n-1,ans+"T");
    }
}
