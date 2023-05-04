package DP_Assignment;

import java.util.Scanner;

public class Minimum_Path_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
        int a[][]=new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                a[i][j]= sc.nextInt();
        }
        int dp[][]=new int[m][n];
        dp[0][0]=a[0][0];
        for(int i=1;i<m;i++){
            dp[i][0]=dp[i-1][0]+a[i][0];
        }
        for(int i=1;i<n;i++){
            dp[0][i]=dp[0][i-1]+a[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=a[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
