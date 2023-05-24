import java.util.Arrays;
import java.util.Scanner;

public class Nth_fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n,dp));
    }
    public static long fibo(int n,long dp[]){
        if(n==0 || n==1)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
}
