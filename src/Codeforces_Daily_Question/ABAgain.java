package Codeforces_Daily_Question;

import java.util.Scanner;

public class ABAgain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=n/10+n%10;
            System.out.println(s);
        }
    }
}
