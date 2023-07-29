package Codeforces_Daily_Question;

import java.util.Scanner;

public class Ilya_and_Bank_Account {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n>=0)
            System.out.println(n);
        else{
            n=n*(-1);
            long l=n%10;
            long l2=n%100;
            l2=l2/10;
            long m=n/10;
            long s=n/100;
            s=s*10+l;
            s=s*(-1);
            m=m*(-1);
//            System.out.println(l+" "+l2+" "+m+" "+s);
            if(s>m)
                System.out.println(s);
            else
                System.out.println(m);
        }
    }
}
