package Codeforces;

import java.util.Scanner;

public class Rock_and_Lever {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]= sc.nextInt();
            System.out.println(countPair(a));
        }
    }
    public static long countPair(int a[]){
        boolean visited[]=new boolean[a.length];
        long ans=0;
        for(int i=31;i>=0;i--){
            long c=0;
            for(int j=0;j<a.length;j++){
                if((a[j] &(1<<i))!=0 && visited[j]!=true){
                    c++;
                    visited[j]=true;
                }
            }
            ans=ans+((c*(c-1))/2);
        }
        return ans;
    }
}
