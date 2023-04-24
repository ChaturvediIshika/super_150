package Codeforces;

import java.util.Scanner;

public class TubeTube_Feed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        while (k-->0) {
            int n = sc.nextInt();
            int t = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();
            int pos = -1, max = 0, en = 0;
            for (int i = 0; i < n; i++) {
                if (t>= a[i]+i && b[i] > en) {
                    pos = i;
                    max = a[i];
                    en = b[i];
                }
            }
            if(pos==-1)
                System.out.println(pos);
            else
            System.out.println(pos+1);
        }
    }
}
