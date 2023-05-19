package Codeforces_Daily_Question;

import java.util.*;

public class Promo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        long a[]=new long[n+1];
        for(int i=0;i<n;i++)
            a[i]= sc.nextLong();
        Arrays.sort(a);
        for (int i=0;i<n;i++)
            a[i+1]+=a[i];
        while (t-->0){
            int x=sc.nextInt();
            int y= sc.nextInt();
            System.out.println(a[n-x+y]-a[n-x]);
        }
    }
}
