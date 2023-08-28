package Codeforces_Daily_Question;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int sum=0;
        int max=0;
        Arrays.sort(a);
        for(int i=0;i<m;i++) {
            sum += (-1) * a[i];
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}
