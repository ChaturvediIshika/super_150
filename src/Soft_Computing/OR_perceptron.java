package Soft_Computing;

import java.util.Scanner;

public class OR_perceptron {
    public static int activation(int theta,int p){
        if(p<=theta)
            return 0;
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int theta=0;
        int w1=0,w2=0;
        int a[]={0,0,1,1};
        int b[]={0,1,0,1};
        int res[]={0,1,1,1};
        int epoch=2;
        while (epoch-->0){
            for(int i=0;i<a.length;i++){
                int p=a[i]*w1+b[i]*w2;
                p=activation(theta,p);
                int err=res[i]-p;
                int d1=a[i]*err;
                w1=w1+d1;
                int d2=b[i]*err;
                w2=w2+d2;
            }
        }
        System.out.println(w1+" "+w2);
    }
}
