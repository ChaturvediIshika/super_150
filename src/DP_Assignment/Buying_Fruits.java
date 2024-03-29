package DP_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Buying_Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int a[][] = new int[m][3];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < 3; j++)
                    a[i][j] = sc.nextInt();
            }
            int max = Integer.MAX_VALUE;
            for (int i = 1; i < m; i++) {
                a[i][0]+=Math.min(a[i-1][1],a[i-1][2]);
                a[i][1]+=Math.min(a[i-1][0],a[i-1][2]);
                a[i][2]+=Math.min(a[i-1][0],a[i-1][1]);
            }
            Arrays.sort(a[m-1]);
            System.out.println(a[m-1][0]);
        }
    }
    public static int fruit(int a[][],int i,int j,int dp[][]){
        if(i>=a.length || j>=a[0].length ||i<0 ||j<0)
            return Integer.MAX_VALUE;
        if(i==a.length-1)
            return a[i][j];
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=0;k<a[0].length;k++) {
            int m2=0;
            if(j!=k)
                m2 = fruit(a, i + 1, k, dp);
            ans=Math.min(ans,m2);
        }
        return dp[i][j]=a[i][j]+ans;
    }
}
