package Codeforces_Daily_Question;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            long n=sc.nextInt();
            int c=2;
            int div=3;
            while (n%div!=0){
                c*=2;
                div+=c;
            }
            System.out.println(n/div);
        }
    }
}
