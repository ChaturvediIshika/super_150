package Codeforces_Daily_Question;

import java.util.Scanner;

public class Long_Comparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int x1=sc.nextInt();
            int p1= sc.nextInt();
            int x2=sc.nextInt();
            int p2=sc.nextInt();
            int min=Math.min(p1,p2);
            p1=p1-min;
            p2=p2-min;
            x1= (int) (x1*(Math.pow(10,p1)));
            x2= (int) (x2*(Math.pow(10,p2)));
            if(x1>x2)
                System.out.println(">");
            else if(x1<x2)
                System.out.println("<");
            else
                System.out.println("=");
        }
    }
}
