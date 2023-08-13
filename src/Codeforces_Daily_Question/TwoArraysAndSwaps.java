package Codeforces_Daily_Question;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]= sc.nextInt();
            for (int i=0;i<n;i++)
                b[i]= sc.nextInt();
            Arrays.sort(a);Arrays.sort(b);
            for(int i=0;i<n;i++){
                if(k>0){
                    if(a[i]<b[n-1-i]){
                        a[i]=b[n-1-i];k--;
                    }
                }
            }
            int sum=0;
            for (int m=0;m<n;m++){
                sum+=a[m];
            }
//            System.out.println(Arrays.toString(a));
            System.out.println(sum);
        }
    }
}
