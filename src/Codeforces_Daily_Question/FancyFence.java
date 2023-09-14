package Codeforces_Daily_Question;

import java.util.Scanner;

public class FancyFence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            if(360%(180-n)==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
