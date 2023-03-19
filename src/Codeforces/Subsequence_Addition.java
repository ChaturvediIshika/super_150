package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Subsequence_Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            subs(a,n);
        }
    }
    public static void subs(int a[],int n){
        long f=1;
        if(a[0]!=1){
            System.out.println("NO");
            return;
        }
        for (int i=1;i<n;i++){
            if(a[i]<=f){
                f+=a[i];
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
