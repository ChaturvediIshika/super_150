package Cryptography;

import java.util.Scanner;

public class Rabin_Miller {
    public static void main(String[] args) {
        if(test(51,2))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }
    public static boolean test(int n,int a){
        int m=n-1;
        int k=0;
        while (m%2==0){
            k++;
            m=m/2;
        }
        int t=1;
        int q=m;
        while (q-->0){
            t=(t*a)%n;
        }
        if(t==1 || t==-1 || t==n-1)
            return true;
        for(int i=1;i<k;i++){
            t=(t*t)%n;
            if(t==1)
                return false;
            if(t==-1 || t==n-1)
                return true;
        }
        return false;
    }
}
