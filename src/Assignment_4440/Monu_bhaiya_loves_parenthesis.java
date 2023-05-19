package Assignment_4440;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Monu_bhaiya_loves_parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int dp[][]=new int[str.length()][str.length()];
        for(int i[]:dp)
            Arrays.fill(i,-1);
        System.out.println(paren(str,0,str.length()-1,dp));
    }
    public static int paren(String str,int i,int j,int dp[][]){
        if(i>j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=0;
        if(str.charAt(i)==str.charAt(j)) {
            int f1 = paren(str, i + 1, j,dp);
            int f2 = paren(str, i, j - 1,dp);
            ans=Math.max(ans,Math.max(f1,f2));
        }
        if(str.charAt(i)!=str.charAt(j)) {
            int fz=2+paren(str, i + 1, j - 1,dp);
            ans=Math.max(ans,fz);
        }
        return dp[i][j]=ans;
    }
    public static int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
                if(st.isEmpty())
                    st.push(i);
                else
                {
                    int len=i-st.peek();
                    max=Math.max(max,len);
                }
            }
        }
        return max;
    }
}
