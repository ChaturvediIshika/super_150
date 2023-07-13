package Codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Two_Arrays_and_Sum_of_Functions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long a[]=new long[n];
        Long b[]=new Long[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextLong();
        for (int i=0;i<n;i++)
            b[i]=sc.nextLong();
        Long c[]=new Long[n];
        for (int i=0;i<n;i++){
            c[i]=(1L*a[i]*((i+1)*(n-i)));
        }
        long mod=998244353;
        Arrays.sort(c);
        Arrays.sort(b,Collections.reverseOrder());
        long sum=0;
        for(int i=0;i<n;i++){
            sum=(sum+((c[i]%mod)*b[i])%mod)%mod;
        }
        System.out.println(sum);

    }
}
