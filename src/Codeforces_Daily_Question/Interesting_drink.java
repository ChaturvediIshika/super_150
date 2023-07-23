package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Interesting_drink {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        Arrays.sort(a);
        int q= sc.nextInt();
        while (q-->0){
            int t= sc.nextInt();
            int l=0,h=n-1,ans=0;
            while (l<=h){
                int mid=(l+h)/2;
                if(a[mid]<=t){
                    ans=mid+1;
                    l=mid+1;
                }
                else h=mid-1;
            }
            System.out.println(ans);
        }
    }
}
