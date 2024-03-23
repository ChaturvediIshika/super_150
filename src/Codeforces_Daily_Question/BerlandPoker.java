package Codeforces_Daily_Question;

import java.util.Scanner;

public class BerlandPoker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            if(m<=(n/k))
                System.out.println(m);
            else {
                m-=(n/k);
                int c= (int) Math.ceil(m/(k-1.0));
                if(c>=n/k)
                    System.out.println(0);
                else
                    System.out.println((n/k)-c);
            }
        }
    }
}
