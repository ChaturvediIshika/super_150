package Bit_Masking;

import java.util.Arrays;
import java.util.Scanner;

public class i_coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextDouble();
        double [][]dp=new double[(n+3)/2][n];
        for (double i[]:dp)
            Arrays.fill(i,-1);
        System.out.println(coins(a,(n+1)/2,0,dp));
    }
    public static double coins(double a[],int h,int i,double dp[][]){
        if(h==0)
            return 1;
        if(i==a.length)
            return 0;
        if(dp[h][i]!=-1)
            return dp[h][i];
        return dp[h][i]=a[i]*coins(a,h-1,i+1,dp)+(1-a[i])*coins(a,h,i+1,dp);
    }
}
