package Codeforces_Daily_Question;

import java.util.Scanner;

public class FoodforAnimals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int r1=0,r2=0;
            if(a<x)
                r1=x-a;
            if(b<y)
                r2=y-b;
            if(r1+r2<=c)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
