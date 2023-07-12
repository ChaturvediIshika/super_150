package Codeforces_Daily_Question;

import java.util.Scanner;

public class Game_With_Sticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int k=Math.min(m,n);
        if (k%2==0)
            System.out.println("Malvika");
        else
            System.out.println("Akshat");
    }
}
