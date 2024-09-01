package Codeforces_Daily_Question;

import java.util.Scanner;

public class MakeAllEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n+1];
            for(int i=0;i<n;i++){
                a[sc.nextInt()]++;
            }
            int max=0;
            for(int i=1;i<=n;i++)
                max=Math.max(max,a[i]);
            System.out.println(n-max);
        }
    }
}
