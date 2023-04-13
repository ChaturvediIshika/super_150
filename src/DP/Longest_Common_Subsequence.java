package DP;

import java.util.Arrays;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="ace";
//        System.out.println(lcs(str1,str2,0,0));
//        System.out.println(lcs2(str1,str2,str1.length()-1,str2.length()-1));
//        int dp[][]=new int[str1.length()][str2.length()];
//        for (int []i:dp)
//            Arrays.fill(i,-1);
//        System.out.println(lcsTd(str1,str2,0,0,dp));
        System.out.println(lcsUP(str1,str2));
    }
    public static int lcs(String str1,String str2,int i,int j){
        if(str1.length()==i || str2.length()==j)
            return 0;
        int ans=0;
        if(str1.charAt(i)==str2.charAt(j)) {
            ans=1+lcs(str1,str2,i+1,j+1);
        }
        else {
            int f1 = +lcs(str1, str2,i+1,j);
            int f2 = +lcs(str1, str2,i,j+1);
            ans= Math.max(f1, f2);
        }
        return ans;
    }
    public static int lcs2(String str1,String str2,int i,int j){
        if(-1==i || -1==j)
            return 0;
        int ans=0;
        if(str1.charAt(i)==str2.charAt(j)) {
            ans=1+lcs2(str1,str2,i-1,j-1);
        }
        else {
            int f1 = +lcs2(str1, str2,i-1,j);
            int f2 = +lcs2(str1, str2,i,j-1);
            ans= Math.max(f1, f2);
        }
        return ans;
    }
    public static int lcsTd(String str1,String str2,int i,int j,int dp[][]){
        if(str1.length()==i || str2.length()==j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=0;
        if(str1.charAt(i)==str2.charAt(j)) {
            ans=1+lcsTd(str1,str2,i+1,j+1,dp);
        }
        else {
            int f1 = +lcsTd(str1, str2,i+1,j,dp);
            int f2 = +lcsTd(str1, str2,i,j+1,dp);
            ans= Math.max(f1, f2);
        }
        return dp[i][j]=ans;
    }
    public static int lcsUP(String str1,String str2){
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[str1.length()][str2.length()];
    }
}
