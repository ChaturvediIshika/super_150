package Assignment_4440;

import java.util.Arrays;
import java.util.Scanner;

public class Match_TIE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[][]=new int[n][2];
        for (int i=0;i<n;i++){
            a[i][0]=sc.nextInt();//north
            a[i][1]=sc.nextInt();//south
        }
        Arrays.sort(a,(p,q)->p[0]==q[0]?p[1]-q[1]:p[0]-q[0]);
//        for (int i=0;i<n;i++)
//            System.out.println(a[i][0]+" "+a[i][1]);
        System.out.println(lengthOfLIS(a));
    }
    public static int lengthOfLIS(int[][] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i][1]>=nums[j][1])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
        int max=dp[0];
        for(int i=1;i<dp.length;i++)
            max=Math.max(max,dp[i]);
        return max;
    }
}
