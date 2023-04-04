package Codeforces;

import java.util.Scanner;

public class Living_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n= sc.nextLong();
            long s=base(n);
            String str=""+s;
            str=str.replace('8','9');
            str=str.replace('7','8');
            str=str.replace('6','7');
            str=str.replace('5','6');
            str=str.replace('4','5');
            System.out.println(str);
        }
    }
    public static long base(long n){
        long m=1;
        long s=0;
        while (n>0){
            long r=n%9;
            s+=r*m;
            m*=10;
            n/=9;
        }
        return s;
    }
}
