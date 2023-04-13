package DP;

public class Uncrossed_Lines {
    public static void main(String[] args) {
        int a[]={2,5,1,2,5};
        int b[]={10,5,2,1,5,2};
        System.out.println(lcs(a,b));
    }
    public static int lcs(int nums1[],int nums2[]){
        int dp[][]=new int[nums1.length+1][nums2.length+1];
        for(int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if(nums1[i-1]==nums2[j-1])
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[nums1.length][nums2.length];
    }
}
