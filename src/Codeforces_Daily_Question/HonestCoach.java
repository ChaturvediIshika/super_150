package Codeforces_Daily_Question;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            int sum=Integer.MAX_VALUE;
            for (int i=0;i<n-1;i++)
                sum=Math.min(sum,a[i+1]-a[i]);
            System.out.println(sum);
        }
    }
}
