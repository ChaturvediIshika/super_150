package Codeforces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Karina_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            long a[]=new long[n];
            for (int i=0;i<n;i++)
                a[i]= sc.nextLong();
            Arrays.sort(a);
            if(a[0]*a[1]>a[n-1]*a[n-2])
                System.out.println(a[0]*a[1]);
            else
                System.out.println(a[n-1]*a[n-2]);
        }
    }

}
