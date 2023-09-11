package Codeforces_Daily_Question;

import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b= sc.nextInt();
            if(a!=b){
                System.out.println("Happy Alex");
                System.exit(0);
            }
        }
        System.out.println("Poor Alex");
    }
}
