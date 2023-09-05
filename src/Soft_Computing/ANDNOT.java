package Soft_Computing;

import java.util.Scanner;

public class ANDNOT {
    public static void main(String[] args) {
        double w1=0.5,w2=0.5;
        int a[]={-1,1,-1,1};
        int b[]={-1,-1,1,1};
        int res[]={-1,1,-1,-1};
        double bias=0;
        int epoch=5;
        double lr=0.2;
        while (epoch-->0){
            for(int i=0;i<a.length;i++){
                double p=a[i]*w1+b[i]*w2+bias;
                double err=(res[i]-p);
                err=err*lr;
                double d1=a[i]*err;
                w1=w1+d1;
                double d2=b[i]*err;
                w2=w2+d2;
                double db=err;
                bias+=db;
//                System.out.println("w1="+w1+" "+"w2="+w2);
                System.out.println(err);

            }
        }
        System.out.println(w1+" "+w2);
    }
}
