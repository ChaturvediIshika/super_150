package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class OneandTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int l[]=new int[n];
            int r[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            l[0]=a[0];
            for(int i=1;i<n;i++)
                l[i]=l[i-1]*a[i];
            r[n-1]=a[n-1];
            for(int i=n-2;i>=0;i--)
                r[i]=r[i+1]*a[i];
//            System.out.println(Arrays.toString(l));
//            System.out.println(Arrays.toString(r));
            for (int i=0;i<n-1;i++){
                if(l[i]==r[i+1]/a[i]) {
                    System.out.println(i+1);
                    continue outer;
                }
            }
            System.out.println(-1);
        }
    }
}
