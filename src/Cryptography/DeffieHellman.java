package Cryptography;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeffieHellman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
//        int alpha=primitiveRoot(q);
        int alpha= sc.nextInt();
        int r=(int)(Math.random()*(q-1))+1;
//        int Xa=q-r;
        int Xa=sc.nextInt();
        int Ya=1;
        int c=Xa;
        while (c-->0){
            Ya=(Ya*alpha)%q;
        }
        System.out.println("KEY A : "+Xa+" "+Ya);
        r=(int)(Math.random()*(q-1))+1;
//        int Xb=q-r;
        int Xb= sc.nextInt();
        c=Xb;
        int Yb=1;
        while (c-->0){
            Yb=(Yb*alpha)%q;
        }
        System.out.println("KEY B : "+Xb+" "+Yb);
        int Ka=1,Kb=1;
        c=Xa;
        while (c-->0){
            Ka=(Ka*Yb)%q;
        }
        c=Xb;
        while (c-->0){
            Kb=(Kb*Ya)%q;
        }
        if(Ka==Kb)
            System.out.println("Key Exchange Successful "+Ka+" "+Kb);
        else
            System.out.println("Key Exchange Not Successful");
    }
    public static int primitiveRoot(int n){
        List<Integer> ls=prim_root_can(n);
        int p=phi(n);
        pri_root(p,ls,n);
        return ls.get(ls.size()-1);
    }
    public static List<Integer> prim_root_can(int n){
        List<Integer> ls=new ArrayList<>();
        List<Integer> pr=new ArrayList<>();
        pr.add(1);
        outer:
        for(int i=2;i<n;i++){
            if(n%i==0)
                ls.add(i);
            else{
                for(int j:ls){
                    if(((i % j) == 0) || ((j % i) == 0)){
                        ls.add(i);
                        continue outer;
                    }
                }
                pr.add(i);
            }
        }
        return pr;
    }
    public static int phi(int n){
        int res=1;
        for(int i=2;i<n;i++){
            if(gcd(n,i)==1)
                res++;
        }
        return res;
    }
    public static int gcd(int a,int b){
        if(a%b==0)
            return b;
        if(a==b)
            return a;
        return gcd(b,a%b);
    }
    public static void pri_root(int phi_n,List<Integer> ls,int n){
        List<Integer> pr=new ArrayList<>();
        outer:
        for(int i:ls) {
            int r=i,k=phi_n;
            while (k-->2){
                r=(r*i)%n;
                if(r==1) {
                    continue outer;
                }
            }
            pr.add(i);
        }
        System.out.println(pr);
    }
}
