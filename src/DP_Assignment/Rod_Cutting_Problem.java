package DP_Assignment;

import java.util.Scanner;

public class Rod_Cutting_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int k= sc.nextInt();
        Integer dp[]=new Integer[k+1];
        System.out.println(rod(a,k,dp));
    }
    public static int rod(int a[],int k,Integer dp[]){
        if(k==0)
            return 0;
        if (k<0)
            return Integer.MIN_VALUE;
        if(dp[k]!=null)
            return dp[k];
        int ans=0;
        for(int i=1;i<=a.length;i++){
            ans=Math.max(ans,a[i-1]+rod(a,k-i,dp));
        }
        return dp[k]=ans;
    }
}
