package recursion;

import java.util.List;

public class Generate_Parentheses {
    public static void main(String[] args) {
        int n=3;
        Parentheses(n,0,0,"");
    }
    public static void Parentheses(int n,int open,int close,String ans)
    {
        if(open==n && close==n)
        {
            System.out.println(ans);
            return;
        }
        if(open<n) {
            Parentheses(n, open + 1, close, ans + "(");
        }
        if(close<open)
        {
            Parentheses(n,open,close+1,ans+")");
        }
    }
}
