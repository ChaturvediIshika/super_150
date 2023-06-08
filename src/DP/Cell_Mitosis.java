package DP;

import java.util.Scanner;

public class Cell_Mitosis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        minCost(n,x,y,z);
    }
    public static void minCost(int n,int x,int y,int z){
        long cost=0;
        long dp[]=new long[n+1];
        for(int i=2;i<=n;i++){
            if(i%2==0){
                dp[i]=Math.min(dp[i/2]+x,dp[i-1]+y);
            }
            else{
                dp[i]=Math.min(dp[i-1]+y,dp[(i+1)/2]+x+z);
            }
        }
        System.out.println(dp[n]);
    }
}
