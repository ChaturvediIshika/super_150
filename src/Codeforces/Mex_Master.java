package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Mex_Master {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println(mex(a,n));
        }
    }
    static int mex(int[] a, int n) {
        Arrays.sort(a);
        int c=0,q=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
                c++;
            if(a[i]==1){
                q++;
            }
        }
        if(c<=(n+1)/2)
            return 0;
        if(c+q==n && q>0)
            return 2;
        return 1;
    }
}
