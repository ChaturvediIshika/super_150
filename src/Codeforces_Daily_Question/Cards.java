package Codeforces_Daily_Question;

import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s= sc.next();
        int n=0,z=0;
        for(int i=0;i<t;i++){
            if(s.charAt(i)=='n')
                n++;
            if(s.charAt(i)=='z')
                z++;
        }
        while (n-->0)
            System.out.print("1 ");
        while (z-->0)
            System.out.print("0 ");
    }
}
