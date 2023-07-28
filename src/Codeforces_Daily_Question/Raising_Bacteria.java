package Codeforces_Daily_Question;

import java.util.Scanner;

public class Raising_Bacteria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c=0;
        while (n>0){
            n=n&(n-1);
            c++;
        }
        System.out.println(c);
    }
}
