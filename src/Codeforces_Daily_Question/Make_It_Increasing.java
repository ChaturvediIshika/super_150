package Codeforces_Daily_Question;

import java.util.Scanner;

public class Make_It_Increasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int c=0;
            int f=0;
            for(int i=n-2;i>=0;i--){
                while(a[i+1]<=a[i] && a[i]>0){
                    a[i]=a[i]/2;
                    c++;
                }
                if(a[i]>=a[i+1]){
                    f=1;
                    System.out.println(-1);
                    break;
                }
            }
            if (f == 0) {
                System.out.println(c);
            }
        }
    }
}
