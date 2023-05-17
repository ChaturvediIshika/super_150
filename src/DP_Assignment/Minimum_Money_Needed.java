package DP_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Money_Needed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int w= sc.nextInt();
        int val[]=new int[w];
        for (int i=0;i<w;i++)
            val[i]= sc.nextInt();
        long dp[][]=new long[1001][1001];
        for (long i[]:dp)
            Arrays.fill(i,-1);
        System.out.println(money(w,w,val,dp));
    }
    public static long money(int n,int w,int val[],long dp[][]){
        if (w==0)
            return 0;
        if (n==0)
            return Integer.MAX_VALUE;
        if(dp[n][w]!=-1)
            return dp[n][w];
        long ans=money(n-1,w,val,dp);
        if(w<n || val[n-1]==-1)
            return ans;
        ans=Math.min(ans,val[n-1]+money(n,w-n,val,dp));
        return dp[n][w]=ans;
    }
}
