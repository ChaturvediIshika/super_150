package Codeforces_Daily_Question;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n==1)
            System.out.print("I hate it");
        else{
            for(int i=1;i<n;i++){
                if(i%2==0)
                    System.out.print("I love ");
                else
                    System.out.print("I hate ");
                System.out.print("that ");
            }
            if(n%2==0)
                System.out.print("I love it");
            else
                System.out.print("I hate it");
        }
    }
}
