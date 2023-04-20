package DP;

import java.util.Scanner;

public class Edit_Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.next();
        String word2=sc.next();
//        System.out.println(edit(word1,word2,0,0));
        System.out.println(edit2(word1,word2));
    }
    public static int edit(String word1,String word2,int i,int j){
        if(i==word1.length())
            return word2.length()-j;
        if(j==word2.length())
            return word1.length()-i;
        int ans=0;
        if(word1.charAt(i)==word2.charAt(j))
            ans=edit(word1,word2,i+1,j+1);
        else {
            int in = edit(word1, word2, i, j + 1);
            int de = edit(word1, word2, i + 1, j);
            int re=edit(word1,word2,i+1,j+1);
            ans=Math.min(in,Math.min(de,re))+1;
        }

        return ans;
    }
    public static int edit2(String word1,String word2){
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=i;
        }
        for (int i=0;i<dp.length;i++)
            dp[i][0]=i;
        for(int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
