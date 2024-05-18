package Codeforces_Daily_Question;

import java.util.Scanner;

public class GregsWorkout {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ch=0,bi=0,ba=0;
        for(int i=0;i<n;i++){
            if(i%3==0)
                ch+= sc.nextInt();
            else if (i%3==1)
                bi+=sc.nextInt();
            else
                ba+= sc.nextInt();
        }
        if(ch>bi && ch>ba)
            System.out.println("chest");
        else if (bi>ch && bi>ba) {
            System.out.println("biceps");
        }
        else System.out.println("back");
    }
}
