package Codeforces_Daily_Question;

import java.util.Scanner;

public class Mainak_and_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            int ans=0;
            for (int i=0;i<n-1;i++){
                ans=Math.max(ans,a[i]-a[i+1]);
                ans=Math.max(ans,a[i]-a[0]);
                ans=Math.max(ans,a[n-1]-a[i]);
            }
            System.out.println(ans);
        }
    }
}
