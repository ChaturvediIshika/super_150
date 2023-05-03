package DP_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class CodeWars_20_Edit_Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1= sc.next();
        String str2=sc.next();
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for (int i[]:dp)
            Arrays.fill(i,-1);
        System.out.println(war(str1,str2,0,0,dp));
    }
    public static int war(String str1,String str2,int i,int j,int dp[][]){
        if(i==str1.length())
            return str2.length()-j;
        if(j==str2.length())
            return str1.length()-i;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=0;
        if(str2.charAt(j)==str1.charAt(i))
            ans=war(str1,str2,i+1,j+1,dp);
        else {
            int in = war(str1, str2, i, j + 1,dp);
            int de = war(str1, str2, i + 1, j,dp);
            int up=war(str1,str2,i+1,j+1,dp);
            ans=Math.min(in,Math.min(de,up))+1;
        }
        return dp[i][j]=ans;
    }
}
