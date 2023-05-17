package DP_Assignment;

import java.util.Scanner;

public class Optimal_Game_Strategy_II {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++)
            arr[i]= sc.nextInt();
        Long dp[][]=new Long[n][n];
        System.out.println(optimal(arr,0,n-1,dp));
    }
    public static long optimal(int arr[],int i,int j,Long dp[][]){
        if(i>j)
            return 0;
        if(dp[i][j]!=null)
            return dp[i][j];
        long p=arr[j]+Math.min(optimal(arr,i+1,j-1,dp),optimal(arr,i,j-2,dp));
        long q=arr[i]+Math.min(optimal(arr,i+2,j,dp),optimal(arr,i+1,j-1,dp));
        return dp[i][j]=Math.max(p,q);
    }
}
