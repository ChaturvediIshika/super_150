package Codeforces_Daily_Question;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class VladandCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            if(n==1 && a[0]==1){
                System.out.println("YES");
            }
            else if(n==1)
                System.out.println("NO");
            else {
                Arrays.sort(a);
                if (a[n - 1] - a[n - 2] >= 2)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}
