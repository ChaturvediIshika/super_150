package Cryptography;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RSA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter p");
//        int p= sc.nextInt();
//        System.out.println("enter q");
//        int q= sc.nextInt();

        int n= sc.nextInt();
//        int phi_n=(p-1)*(q-1);
        System.out.println("enter e");
        int e= sc.nextInt();
//        int q0=0,r1=phi_n,r2=e,t1=0,t2=1,r=0,t=0;
//        while (r2!=0){
//            q0=r1/r2;
//            r=r1%r2;
//            t=t1-(q0*t2);
//            r1=r2;
//            r2=r;
//            t1=t2;
//            t2=t;
//        }
//        if(t1<0){
//            t1=phi_n+t1;
//        }
//        int d=t1;
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<26;i++){
            ls.add(rsa(e,n,i));
        }
        int z= sc.nextInt();
        while (z-->0) {
            System.out.println("enter M");
            int dec = sc.nextInt();
            for(int j=0;j<ls.size();j++){
                if(ls.get(j)==dec)
                    System.out.println((char)('a'+j));
            }
        }

//        int dec=1;
//        while (d-->0){
//            dec=(dec*enc)%n;
//        }
//        System.out.println((char) ('a'+dec));

    }
    public static int rsa(int e,int n,int M){
        int enc=1;
        while (e-->0){
            enc=(enc*M)%n;
        }
        return enc;
    }
}
