package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a[]=new int[4];
            for (int i=0;i<4;i++)
                a[i]= sc.nextInt();
            int m1=Math.max(a[0],a[1]);
            int m2=Math.max(a[2],a[3]);
            Arrays.sort(a);
            if((m1==a[2] && m2==a[3]) ||(m1==a[3] && m2==a[2]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
