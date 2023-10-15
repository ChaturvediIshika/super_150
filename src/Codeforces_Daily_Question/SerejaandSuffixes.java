package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SerejaandSuffixes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int dp[]=new int[n];
        HashSet<Integer> hs=new HashSet<>();
        dp[n-1]=1;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        hs.add(a[n-1]);
        for(int i=n-2;i>=0;i--){
            if(hs.contains(a[i]))
                dp[i]=dp[i+1];
            else {
                dp[i] = dp[i + 1] + 1;
                hs.add(a[i]);
            }
        }
//        System.out.println(Arrays.toString(dp));
        while (m-->0){
            int l=sc.nextInt();
            System.out.println(dp[l-1]);
        }

    }
}
