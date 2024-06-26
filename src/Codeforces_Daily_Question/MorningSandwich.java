package Codeforces_Daily_Question;

import java.util.Scanner;

public class MorningSandwich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int b= sc.nextInt();
            int c=sc.nextInt();
            int h= sc.nextInt();
            System.out.println(Math.min(b-1,c+h)*2+1);
        }
    }
}
