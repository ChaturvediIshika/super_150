package DP_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class GOLDMINE_PROBLEM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++)
                    a[i][j]= sc.nextInt();
            }
            int max=0;
            for(int i=0;i<m;i++){
                int dp[][]=new int[m][n];
                for (int d[]:dp)
                    Arrays.fill(d,-1);
                max=Math.max(max,mine(a,i,0,dp));
            }
            System.out.println(max);
        }
    }
    public static int mine(int a[][],int i,int j,int dp[][]){
        if(i>=a.length || j>=a[0].length ||i<0 ||j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int m1=mine(a,i,j+1,dp);
        int m2=mine(a,i+1,j+1,dp);
        int m3=mine(a,i-1,j+1,dp);
        return dp[i][j]=a[i][j]+Math.max(m1,Math.max(m2,m3));
    }
}
