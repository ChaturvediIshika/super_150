package Cryptography;

import java.util.Scanner;

public class DigitalSignature_DSA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int p=sc.nextInt();
        int g=sc.nextInt();
        int r=(p-1)/q;
//        int g=1;
//        while (r-->0){
//            g=(g*h)%p;
//        }
//        System.out.println(g);
        int x= sc.nextInt();
        int y=1;
        int xx=x;
        while (xx-->0){
            y=(y*g)%p;
        }
        System.out.println(y);
//        int m=sc.nextInt();
        int k= sc.nextInt();
        r=1;
        int z=k;
        while (z-->0){
            r=(r*g)%p;
        }
        r=r%q;
        int hm=sc.nextInt();
        int k_inv=inverse(k,q);
        System.out.println(k_inv);
        int s=(k_inv%q*(hm+x*r)%q)%q;
        System.out.println(r+" || "+s);
        int s_inv=inverse(s,q);
        int w=s_inv%q;
        int u1=(hm*w)%q;
        int u2=(r*w)%q;
        int v=1;
        while (u1-->0){
            v=(v*g)%p;
        }

        while (u2-->0){
            v=(v*y)%p;
        }
        v=v%q;
        if(v==r)
            System.out.println("Verified");
        else
            System.out.println("Not");
    }
    public static int inverse(int k,int q){
        k=k%q;
        int qo=0,r1=q,r2=k,t1=0,t2=1,r=0,t=0;
        while (r2>0){
            qo=r1/r2;
            r=r1%r2;
            t=t1-t2*qo;
            r1=r2;
            r2=r;
            t1=t2;
            t2=t;
        }
        if(t1<0)
            return q+t1;
        return t1;
    }
}
