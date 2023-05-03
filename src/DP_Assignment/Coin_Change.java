package DP_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Coin_Change {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int c[]=new int[k];
        for (int i=0;i<k;i++){
            c[i]= sc.nextInt();
        }
        int dp[][]=new int[n+1][c.length+1];
        for (int i[]:dp)
            Arrays.fill(i,-1);
        System.out.println(change(n,c,0,0,dp));
    }
    public static int change(int n,int c[],int sum,int j,int dp[][]){
        if(sum>n)
            return 0;
        if (sum==n) {
            return 1;
        }
        if (j==c.length)
            return 0;
        if(dp[sum][j]!=-1) {
            return dp[sum][j];
        }
        int inc=0;
        int exc;
        if(n-sum>=c[j])
            inc=change(n,c,sum+c[j],j,dp);
        exc=change(n,c,sum,j+1,dp);

        return dp[sum][j]=inc+exc;
    }
}
