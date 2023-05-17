package DP_Assignment;

import java.util.Scanner;

public class Minimum_trials_needed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            Integer dp[][]=new Integer[n+1][k+1];
            System.out.println(trials(n,k,dp));
        }
    }
    public static int trials(int n,int k,Integer dp[][]){
        if (n==1)
            return k;
        if(k<=1)
            return k;
        int ans=Integer.MAX_VALUE;
        if(dp[n][k]!=null)
            return dp[n][k];
        for(int i=1;i<=k;i++){
            int d=Math.max(trials(n-1,i-1,dp),trials(n,k-i,dp));
            ans=Math.min(ans,d);
        }
        return dp[n][k]=ans+1;
    }
}
