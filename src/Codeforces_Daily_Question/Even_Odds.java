package Codeforces_Daily_Question;

import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        long t=sc.nextLong();
        long k=n/2;
        if(n%2!=0)
            k++;
        if(t<=k){
            System.out.println((2*t)-1);
        }
        else{
            t=t-k;
            System.out.println(2*t);
        }
    }
}
