package Codeforces_Daily_Question;

import java.util.Scanner;

public class RudolphandTicTacToe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s1= sc.next();
            String s2= sc.next();
            String s3= sc.next();
            if(s1.charAt(0)==s1.charAt(1) && s1.charAt(1)==s1.charAt(2) && s1.charAt(0)!='.')
                System.out.println(s1.charAt(0));
            else if(s2.charAt(0)==s2.charAt(1) && s2.charAt(1)==s2.charAt(2) && s2.charAt(0)!='.')
                System.out.println(s2.charAt(0));
            else if(s3.charAt(0)==s3.charAt(1) && s3.charAt(1)==s3.charAt(2) && s3.charAt(0)!='.')
                System.out.println(s3.charAt(0));
            else if(s1.charAt(0)==s2.charAt(0) && s2.charAt(0)==s3.charAt(0) && s1.charAt(0)!='.')
                System.out.println(s2.charAt(0));
            else if(s1.charAt(1)==s2.charAt(1) && s2.charAt(1)==s3.charAt(1) && s1.charAt(1)!='.')
                System.out.println(s2.charAt(1));
            else if(s1.charAt(2)==s2.charAt(2) && s2.charAt(2)==s3.charAt(2) && s1.charAt(2)!='.')
                System.out.println(s2.charAt(2));
            else if(s1.charAt(0)==s2.charAt(1) && s2.charAt(1)==s3.charAt(2) && s1.charAt(0)!='.')
                System.out.println(s2.charAt(1));
            else if(s1.charAt(2)==s2.charAt(1) && s2.charAt(1)==s3.charAt(0) && s1.charAt(2)!='.')
                System.out.println(s2.charAt(1));
            else
                System.out.println("DRAW");
        }
    }
}
