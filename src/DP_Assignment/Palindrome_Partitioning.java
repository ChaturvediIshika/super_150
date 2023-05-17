package DP_Assignment;

import Inheritance.P;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            String str = sc.next();
            Integer dp[] = new Integer[str.length()];
            System.out.println(palindrome(str, 0, new ArrayList<>(), dp));
        }
    }
    public static boolean palin(String s){
        int i=0,j=s.length()-1;
        while (i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }
    public static int palindrome(String str, int i, List<String> ls, Integer dp[]){
        if(str.length()==i)
            return -1;
        if(dp[i]!=null)
            return dp[i];
        int ans=Integer.MAX_VALUE;
        for (int j=1;i+j<=str.length();j++){
            String s=str.substring(i,i+j);
            if(palin(s)){
                ls.add(s);
                ans=Math.min(ans,1+palindrome(str,i+j,ls,dp));
                ls.remove(ls.size()-1);
            }
        }
        return dp[i]=ans;
    }
}
