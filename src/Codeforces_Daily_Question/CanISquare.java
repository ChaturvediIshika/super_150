package Codeforces_Daily_Question;

import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            long sum=0;
            while (n-->0){
                sum+=sc.nextInt();
            }
            if((int)(Math.sqrt(sum))==Math.sqrt(sum))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
