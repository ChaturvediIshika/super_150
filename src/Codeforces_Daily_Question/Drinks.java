package Codeforces_Daily_Question;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double x=0;
        for (int i=0;i<n;i++){
            x+=sc.nextDouble()/100.0;
//            System.out.println(x);
        }
//        System.out.println(x);
        System.out.println((x/n)*100);
    }
}
