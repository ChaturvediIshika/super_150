package DP_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Longest_Increasing_subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        System.out.println(LIS(n,a));
    }
    public static int LIS(int n,int a[]){
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int max=0;
        for (int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                if(a[i]>a[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                    max=Math.max(max,dp[i]);
                }
            }
        }
        return max;
    }
}
