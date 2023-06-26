package Codeforces_Daily_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c=0,a=0,b=0,d=0;
        for(int i=0;i<n;i++){
            int k= sc.nextInt();
            if(k==4){
                c++;
            } else if (k==1) {
                a++;
            } else if (k==2) {
                b++;
            }
            else
                d++;
        }
        int r=Math.min(a,d);
        c+=r;
        a-=r;
        d-=r;
        c+=d;
        c+=(a+b*2+3)/4;
        System.out.println(c);
    }
}
