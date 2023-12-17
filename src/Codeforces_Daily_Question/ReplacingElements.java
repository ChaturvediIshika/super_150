package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class ReplacingElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            int c=0,l=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            Arrays.sort(a);
            if(a[0]+a[1]<=d)
                System.out.println("YES");
            else {
                for(int i=0;i<n;i++){
                    if(a[i]<=d)
                        c++;
                }
                if(c==n)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
