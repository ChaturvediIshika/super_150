package Codeforces_Daily_Question;

import java.util.Scanner;

public class Juicer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int d=sc.nextInt();
        int c=0;
        int sum=0;
        while (n-->0){
            int k=sc.nextInt();
            if(k<=b)
                sum+=k;
            if(sum>d){
                sum=0;
                c++;
            }
        }
        System.out.println(c);
    }
}
