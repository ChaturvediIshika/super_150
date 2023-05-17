package DP_Assignment;

import java.util.Scanner;

public class Count_Number_of_Binary_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            Long dp[]=new Long[n+1];
            System.out.println(dpTD(n,0,dp));

        }
    }
    public static int binary(int n,String str){
        if(str.length()==n)
            return 1;
        if (str.length()>n)
            return 0;
        int ans=0;
        if (str.length()>0 && str.charAt(str.length()-1)=='1')
            ans+=binary(n,str+'0');
        else{
            ans+=binary(n,str+'1');
            ans+=binary(n,str+'0');
        }
        return ans;
    }
    public static long dpTD(int n,int i,Long dp[]){
        if(i>=n)
            return 1L;
        if(dp[i]!=null)
            return dp[i];
        return dp[i]=dpTD(n,i+2,dp)+dpTD(n,i+1,dp);
    }
}
