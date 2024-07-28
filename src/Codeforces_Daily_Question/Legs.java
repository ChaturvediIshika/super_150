package Codeforces_Daily_Question;

import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=n/4;
            n=n%4;
            c+=n/2;
            System.out.println(c);
        }
    }
}
