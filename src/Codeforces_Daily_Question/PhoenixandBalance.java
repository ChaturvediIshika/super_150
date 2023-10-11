package Codeforces_Daily_Question;

import java.util.Scanner;

public class PhoenixandBalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=(int)Math.pow(2,n);
            int b=(int)Math.pow(2,n-1);
            for(int i=1;i<=(n-2)/2;i++)
                a+=(int) (Math.pow(2,i));
            for(int i=n-2;i>(n-2)/2;i--)
                b+=(int) (Math.pow(2,i));
            System.out.println(Math.abs(a-b));
        }
    }
}
