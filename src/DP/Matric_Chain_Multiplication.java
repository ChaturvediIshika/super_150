package DP;

import java.util.Arrays;

public class Matric_Chain_Multiplication {
    public static void main(String[] args) {
        int a[]={4,2,3,5};
        int dp[][]=new int[a.length][a.length];
        for(int i[]:dp)
            Arrays.fill(i,-1);
        System.out.println(mcm(a,0,a.length-1,dp));
        mcmBU(a);
    }
    public static int mcm(int a[],int si,int ei,int dp[][]){
        if(si+1==ei)
            return 0;
        if(dp[si][ei]!=-1)
            return dp[si][ei];
        int ans=Integer.MAX_VALUE;
        for(int k=si+1;k<ei;k++){
            int fs=mcm(a,si,k,dp);
            int ss=mcm(a,k,ei,dp);
            int rs=a[si]*a[k]*a[ei];
            ans=Math.min(ans,fs+ss+rs);
        }
        return dp[si][ei]=ans;
    }
    public static void mcmBU(int a[]){
        int dp[][]=new int[a.length][a.length];
        for(int slide=2;slide<a.length;slide++){
            for(int j=slide;j<a.length;j++) {
                int i=j-slide;
                int ans=Integer.MAX_VALUE;
                for (int k = i+1 ; k < j; k++) {
                    int fs = dp[i][k];
                    int ss = dp[k][j];
                    int rs = a[i] * a[k] * a[j];
                    ans = Math.min(ans, fs + ss + rs);
                }
                dp[i][j]=ans;
            }
        }
        System.out.println(dp[0][a.length-1]);
    }
}
