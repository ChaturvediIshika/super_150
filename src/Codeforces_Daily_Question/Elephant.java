package Codeforces_Daily_Question;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        c+=n/5;
        n=n%5;
        c+=n/4;
        n=n%4;
        c+=n/3;
        n=n%3;
        c+=n/2;
        n=n%2;
        c+=n;
        System.out.println(c);
    }
}
