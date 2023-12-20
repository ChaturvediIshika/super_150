package Codeforces_Daily_Question;

import java.util.Scanner;

public class PrintaPedestal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=n/3;
            if(n%3==0){
                System.out.println(k+" "+(k+1)+" "+(k-1));
            }
            else if(n%3==1)
                System.out.println(k+" "+(k+2)+" "+(k-1));
            else
                System.out.println((k+1)+" "+(k+2)+" "+(k-1));
        }
    }
}
