package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Day_at_the_Beach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int max[]=new int[n];
        max[0]=a[0];
        for(int i=1;i<n;i++){
            max[i]=Math.max(max[i-1],a[i]);
        }
        int min[]=new int[n];
        min[n-1]=a[n-1];
        for (int i=n-2;i>=0;i--)
            min[i]=Math.min(min[i+1],a[i]);
        int c=1;
        for(int i=0;i<n-1;i++){
            if(max[i]<=min[i+1])
                c++;
        }
//        System.out.println(Arrays.toString(min));
//        System.out.println(Arrays.toString(max));
        System.out.println(c);
    }
}
