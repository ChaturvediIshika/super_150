package Codeforces_Daily_Question;

import java.util.Scanner;

public class MakeitWhite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String s=sc.next();
            int f=s.indexOf('B');
            int l=s.lastIndexOf('B');
            System.out.println(l-f+1);
        }
    }
}
