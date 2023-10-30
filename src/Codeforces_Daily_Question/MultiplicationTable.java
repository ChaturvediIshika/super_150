package Codeforces_Daily_Question;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t= sc.nextInt();
        int c=0;
        for(int i=1;i<n+1;i++){
            if(t%i==0 && t/i<=n)
                c++;
        }
        System.out.println(c);
    }
}
