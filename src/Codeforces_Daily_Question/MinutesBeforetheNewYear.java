package Codeforces_Daily_Question;

import java.util.Scanner;

public class MinutesBeforetheNewYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int h= sc.nextInt();
            int m=sc.nextInt();
            int min=(23-h)*60+(60-m);
            System.out.println(min);
        }
    }
}
