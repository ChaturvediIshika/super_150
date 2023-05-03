package DP_Assignment;

/*Reaching to the top of a staircase, it takes n steps.
 The task can be accomplished either by climbing 1 step or 2 steps at a time.
In how many different ways can you climb to the top.*/

import java.util.Arrays;
import java.util.Scanner;

public class Climbing_Stairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(climb(0,n));
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(climbTD(0,n,dp));
        System.out.println(climbBU(n));
    }
    public static int climb(int sum,int n){
        if(sum>n)
            return 0;
        if(sum==n)
            return 1;
        int r1=climb(sum+1,n);
        int r2=climb(sum+2,n);
        return r1+r2;
    }
    public static int climbTD(int sum,int n,int dp[]){
        if(sum>n)
            return 0;
        if(sum==n)
            return 1;
        if(dp[sum]!=-1)
            return dp[sum];
        int r1=climbTD(sum+1,n,dp);
        int r2=climbTD(sum+2,n,dp);
        return dp[sum]=r1+r2;
    }
    public static int climbBU(int n){
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
