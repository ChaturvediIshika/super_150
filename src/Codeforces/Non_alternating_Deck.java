package Codeforces;

import java.util.Scanner;

public class Non_alternating_Deck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            distribute(n);
        }
    }
    public static void distribute(int n){
        int k=1,a=0,b=0,r=0;
        while(n>=k){
            if(r%2==0){
                a+=k;
            }
            else{
                b+=k;
            }
            n-=k;
            k+=4;
            r++;
        }
        if(r%2==0)
            a+=n;
        else
            b+=n;
        System.out.println(a+" "+b);
    }
}
