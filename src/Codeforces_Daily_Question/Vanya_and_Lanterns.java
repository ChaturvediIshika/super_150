package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Vanya_and_Lanterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        Arrays.sort(a);
        double max=0;
        for (int i=1;i<n;i++)
            max=Math.max(max,a[i]-a[i-1]);
        max=max/2;
        max=Math.max(max,Math.max(l-a[n-1],a[0]));
        System.out.println(max);
    }
}
