package Codeforces_Daily_Question;

import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long x=sc.nextLong();
        int d=0;
        while (n-->0){
            char ch=sc.next().charAt(0);
            long r=sc.nextLong();
            if(ch=='+')
                x+=r;
            else if(ch=='-'){
                if(x<r)
                    d++;
                else
                    x-=r;
            }
        }
        System.out.println(x+" "+d);
    }
}
