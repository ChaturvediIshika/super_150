package Codeforces;

import java.util.Scanner;

public class Fedya_and_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b= sc.nextInt();
            System.out.println(2*(a-b));
            for (long i=b+1;i<=a;i++)
                System.out.print(i+" ");
            for (long i=a-1;i>=b;i--)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
