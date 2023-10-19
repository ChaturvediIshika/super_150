package Codeforces_Daily_Question;

import java.util.Scanner;

public class TwoElevators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int d1=a-1;
            int d2=Math.abs(b-c)+c-1;
            if(d1<d2)
            System.out.println(1);
            else if (d2<d1)
                System.out.println(2);
            else System.out.println(3);
        }
    }
}
