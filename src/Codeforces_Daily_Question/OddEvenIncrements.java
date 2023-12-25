package Codeforces_Daily_Question;

import java.util.Scanner;

public class OddEvenIncrements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            boolean f1=true,f2=true;
            for (int i=0;i<n-2;i+=2){
                if(a[i]%2!=a[i+2]%2){
                    f1=false;
                    break;
                }
            }
            for (int i=1;i<n-2;i+=2){
                if(a[i]%2!=a[i+2]%2){
                    f2=false;
                    break;
                }
            }
            if(f1&& f2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
