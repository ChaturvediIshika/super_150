package DP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Distinct_Subsequences {
    public static void main(String[] args) {
        String s = "rabbbit", t = "rabbit";
        long dp[][]=new long[s.length()][t.length()];
        for(long i[]:dp)
            Arrays.fill(i,-1);
        System.out.println(distinct(s,t,0,0,dp));
    }
    public static long distinct(String s,String t,int i,int j,long dp[][]){
        if(j==t.length())
            return 1;
        if(i==s.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        long inc=0,exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=distinct(s,t,i+1,j+1,dp);
        }
        exc=distinct(s,t,i+1,j,dp);
        return dp[i][j]=inc+exc;
    }
}
