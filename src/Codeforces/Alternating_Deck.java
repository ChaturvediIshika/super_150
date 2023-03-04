package Codeforces;

import java.util.Scanner;

public class Alternating_Deck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            distribute(n);
        }
    }
    public static void distribute(int n){
        int k=1,aw=0,ab=0,bw=0,bb=0,r=0;
        while(n>=k){
            if(r%2==0){
                aw+=k/2+1;
                ab+=k/2;
            }
            else{
                bw+=k/2;
                bb+=k/2+1;
            }
            n-=k;
            k+=4;
            r++;
        }
        if(r%2==0) {
            if(n%2==0){
                aw+=n/2;
                ab+=n/2;
            }
            else {
                aw += n / 2 + 1;
                ab += n / 2;
            }
        }
        else{
            if(n%2==0){
                bw+=n/2;
                bb+=n/2;
            }
            else {
                bw += n / 2;
                bb += n / 2 + 1;
            }
        }
        System.out.println(aw+" "+ab+" "+bw+" "+bb);
    }
}
