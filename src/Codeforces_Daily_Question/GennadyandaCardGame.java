package Codeforces_Daily_Question;

import java.util.Scanner;

public class GennadyandaCardGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        boolean f=false;
        for (int i=0;i<5;i++){
            String sq= sc.next();
            if(sq.charAt(0)==s.charAt(0))
                f=true;
            if(sq.charAt(1)==s.charAt(1))
                f=true;
        }
        if (f)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
