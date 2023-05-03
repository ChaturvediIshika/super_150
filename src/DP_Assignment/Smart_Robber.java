package DP_Assignment;

/*A professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the
only constraint stopping him from robbing each of them is that adjacent houses have security system connected and it
will automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of
money he can rob tonight without alerting the police.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Smart_Robber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println(rob(a,0));
            int dp[]=new int[n];
            Arrays.fill(dp,-1);
            System.out.println(robTD(a,0,dp));
            System.out.println(robBU(a));
        }
    }
    public static int rob(int a[],int i){
        if(i>=a.length)
            return 0;
        int inc=a[i]+rob(a,i+2);
        int exc=rob(a,i+1);
        return Math.max(inc,exc);
    }
    public static int robTD(int a[],int i,int[] dp){
        if(i>=a.length)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int inc=a[i]+robTD(a,i+2,dp);
        int exc=robTD(a,i+1,dp);
        dp[i]=Math.max(inc,exc);
        return Math.max(inc,exc);
    }
    public static int robBU(int a[]){
        int dp[]=new int[a.length];
        dp[0]=a[0];
        dp[1]=Math.max(dp[0],dp[1]);
        for (int i=2;i<a.length;i++)
            dp[i]=Math.max(dp[i-2]+a[i],dp[i-1]);
        return dp[dp.length-1];
    }
}
