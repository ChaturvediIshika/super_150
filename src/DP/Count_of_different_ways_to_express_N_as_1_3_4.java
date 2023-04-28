package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Count_of_different_ways_to_express_N_as_1_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(count(n,0,""));
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(countTD(n,0,dp));
    }
    public static int count(int n,int sum,String str){
        if(n==sum){
//            System.out.println(str);
            return 1;
        }
        if(sum>n)
            return 0;
        int f1=count(n,sum+1,str+"1+");
        int f2=count(n,sum+3,str+"3+");
        int f3=count(n,sum+4,str+"4+");
        return f1+f2+f3;
    }
    public static int countTD(int n,int sum,int dp[]){
        if(n==sum){
            return 1;
        }
        if(sum>n)
            return 0;
        if(dp[sum]!=-1)
            return dp[sum];
        int f1=countTD(n,sum+1,dp);
        int f2=countTD(n,sum+3, dp);
        int f3=countTD(n,sum+4,dp);
        return dp[sum]=f1+f2+f3;
    }

}
