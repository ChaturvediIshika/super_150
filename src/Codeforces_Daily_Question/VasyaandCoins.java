package Codeforces_Daily_Question;

import java.util.Scanner;

public class VasyaandCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            if(a==0)
                System.out.println(1);
            else
                System.out.println(b*2+a+1);
        }
    }
}
