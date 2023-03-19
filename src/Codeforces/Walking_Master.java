package Codeforces;

import java.util.Scanner;

public class Walking_Master {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(b>d)
                System.out.println(-1);
            else{
                int m=0;
                m+=d-b;
                a+=m;
                if(a<c)
                    System.out.println(-1);
                else{
                    m+=Math.abs(a-c);
                    System.out.println(m);
                }
            }
        }
    }
}
