package Codeforces_Daily_Question;

import java.util.Scanner;

public class ArpahardexamandMehrdadnaivecheat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p[]={6,8,4,2};
        int n=sc.nextInt();
        if(n==0)
            System.out.println(1);
        else
            System.out.println(p[n%4]);
    }
}
