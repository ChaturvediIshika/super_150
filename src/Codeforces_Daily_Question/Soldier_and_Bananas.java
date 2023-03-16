package Codeforces_Daily_Question;

import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int sum=((1+w)*w)/2*k-n;
        if(sum<=0)
            System.out.println(0);
        else
            System.out.println(sum);
    }
}
