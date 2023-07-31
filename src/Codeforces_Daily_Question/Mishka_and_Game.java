package Codeforces_Daily_Question;

import java.util.Scanner;

public class Mishka_and_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c=0,m=0;
        while (n-->0){
            int u= sc.nextInt();
            int v= sc.nextInt();
            if(u>v)
                m++;
            else if(v>u)
                c++;
        }
        if (c==m)
            System.out.println("Friendship is magic!^^");
        else if(c>m)
            System.out.println("Chris");
        else
            System.out.println("Mishka");
    }
}
