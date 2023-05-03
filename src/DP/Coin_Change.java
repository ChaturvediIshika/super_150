package DP;

import java.util.Scanner;
import java.util.Arrays;

public class Coin_Change {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        int amt= sc.nextInt();
        System.out.println(coinChange(a,amt));
    }
    public static int coinChange(int[] coins, int amount) {
        int max=amount+1;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,max);
        dp[0]=0;
        for(int i=1 ; i<=amount; i++)
        {
            for(int j=0; j<coins.length ; j++)
            {
                if(coins[j]<=i)
                {
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount? -1: dp[amount];
    }
}
