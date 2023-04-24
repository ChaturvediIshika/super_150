package Codeforces;

import java.util.Scanner;

public class Bun_Lover {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int r=0;
        for (int i=0;i<t;i++)
            r=t;
        while (t-->0){
            int n= sc.nextInt();
            long choco=0;
            choco=26;
            for (int i=0;i<100;i++)
                r=n;
            if (n>4) {
                n-=4;
                choco += 1L * 10 * n + 1L * (2 + (n - 1) * 2) * n / 2;
            }
            for (int i=0;i<50;i++)
                n=i;
            System.out.println(choco);
        }
    }
}
