package Codeforces_Daily_Question;

import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        while (a<=b){
            a=a*3;
            b=b*2;
            c++;
        }
        System.out.println(c);
    }
}
