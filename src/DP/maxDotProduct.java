package DP;


import java.util.Arrays;

public class maxDotProduct {
    public static void main(String[] args) {
        int a[]={1,1};
        int b[]={-1,-1};
        System.out.println(product(a,b,0,0,true));
        int dp[][]=new int[a.length][b.length];
        for (int []i:dp)
            Arrays.fill(i,Integer.MIN_VALUE);
        System.out.println(lcs2(a,b,0,0,true,dp));
        System.out.println(lcs3(a,b));
    }
    public static int product(int a[],int b[],int i,int j,boolean f){
        if(i==a.length || j==b.length) {
            if (f)
                return 0;
            return -100000000;
        }
        int dot=a[i]*b[j]+product(a,b,i+1,j+1,true);
        int fd= product(a,b,i+1,j,false);
        int sd=product(a,b,i,j+1,false);
        return Math.max(a[i]*b[j],Math.max(dot,Math.max(fd,sd)));
    }
    public static int lcs2(int a[],int b[],int i,int j,boolean f,int dp[][]){
        if(i==a.length || j==b.length) {
            if (f)
                return 0;
            return -100000000;
        }
        if(dp[i][j]!=Integer.MIN_VALUE)
            return dp[i][j];
        int dot=a[i]*b[j]+product(a,b,i+1,j+1,true);
        int fd= product(a,b,i+1,j,false);
        int sd=product(a,b,i,j+1,false);
        return dp[i][j]= Math.max(a[i]*b[j],Math.max(dot,Math.max(fd,sd)));
    }
    public static int lcs3(int a[],int b[]){
        int sp=Integer.MIN_VALUE;
        int dp[][]=new int[a.length+1][b.length+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int dot=a[i-1]*b[j-1]+dp[i-1][j-1];
                int fd= dp[i-1][j];
                int sd=dp[i][j-1];
                dp[i][j]= Math.max(dot,Math.max(fd,sd));
                sp=Math.max(sp,a[i-1]*b[j-1]);
            }
        }
        if(dp[dp.length-1][dp[0].length-1]==0)
            return sp;
        return dp[a.length][b.length];
    }
}
