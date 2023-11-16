package Codeforces_Daily_Question;

import java.util.Scanner;

public class ArithmeticArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int sum=0;
            for (int i=0;i<n;i++)
                sum+=sc.nextInt();
            if(sum<n)
                System.out.println(1);
            else System.out.println(sum-n);
        }
    }
}
