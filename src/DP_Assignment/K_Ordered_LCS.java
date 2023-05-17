package DP_Assignment;

import java.util.Scanner;

public class K_Ordered_LCS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int b[]=new int[m];
        for (int i=0;i<m;i++)
            b[i]=sc.nextInt();
        int dp[][][]=new int[n][m][k+1];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int t=0;t<=k;t++)
                    dp[i][j][t]=-1;
            }
        }
        System.out.println(lcsTd(a,b,0,0,k,dp));
    }
    public static int lcsTd(int a[],int b[],int i,int j,int k,int dp[][][]){
        if(a.length==i || b.length==j)
            return 0;
        if(dp[i][j][k]!=-1)
            return dp[i][j][k];
        int ans=0;
        if(a[i]==b[j]) {
            ans=1+lcsTd(a,b,i+1,j+1,k,dp);
        }
        else {
            int f1 = +lcsTd(a, b,i+1,j,k,dp);
            int f2 = +lcsTd(a, b,i,j+1,k,dp);
            int f3=0;
            if(k>0){
                f3 = 1+lcsTd(a, b,i+1,j+1,k-1,dp);
            }
            ans= Math.max(f1, Math.max(f2,f3));
        }
        return dp[i][j][k]=ans;
    }
}
