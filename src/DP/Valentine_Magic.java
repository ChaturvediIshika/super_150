package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Valentine_Magic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int b[]=new int[n];
        for (int i=0;i<n;i++)
            b[i]= sc.nextInt();
        int g[]=new int[m];
        for (int i=0;i<m;i++)
            g[i]= sc.nextInt();
        Arrays.sort(b);
        Arrays.sort(g);
        int dp[][]=new int[b.length][g.length];
        for(int i[]:dp)
            Arrays.fill(i,-1);
        System.out.println(diff(b,g,0,0,dp));
    }
    public static int diff(int b[],int g[],int i,int j,int dp[][]){
        if(i==b.length)
            return 0;
        if(j==g.length)
            return 10000000;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int pair=Math.abs(b[i]-g[j])+diff(b,g,i+1,j+1,dp);
        int Nopair=diff(b,g,i,j+1,dp);
        return dp[i][j]=Math.min(pair,Nopair);
    }
}
