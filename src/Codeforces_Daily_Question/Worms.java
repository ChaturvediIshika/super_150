package Codeforces_Daily_Question;

import java.util.Scanner;

public class Worms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            if (i==0)
                a[i]= sc.nextInt();
            else
                a[i]=a[i-1]+ sc.nextInt();
        }
        int m= sc.nextInt();
        int ans=0;
        while (m-->0){
            int q= sc.nextInt();
            int l=0,h=n-1;
            while (l<=h){
                int mid=l+(h-l)/2;
                if(q<=a[mid]){
                    ans=mid;
                    h=mid-1;
                }
                else
                    l=mid+1;
            }
            System.out.println(ans+1);
        }
    }
}
