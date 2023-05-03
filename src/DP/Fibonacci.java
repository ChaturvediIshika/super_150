package DP;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fiboTD(n,dp));
        System.out.println(fiboBU(n));
//        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n==0 || n==1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static int fiboTD(int n,int dp[]){
        if(n==0 || n==1)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]=fibo(n-1)+fibo(n-2);
    }
    public static int fiboBU(int n){
        int a[]=new int[n+1];
        if(n>0)
            a[1]=1;
        for(int i=2;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
}
