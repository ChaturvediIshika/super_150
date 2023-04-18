package Codeforces_Daily_Question;

import java.util.Scanner;

public class Lucky_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int max=0,diff=0;
            for(int i=Math.max(l,r-100);i<=r;i++){
//                System.out.println(i);
//                System.out.println(high(i)+" "+low(i));
                if(diff<=(high(i)-low(i))){
                    diff=high(i)-low(i);
                    max=i;
                }
            }
            System.out.println(max);
        }
    }
    public static int high(int n){
        int m=0;
        while (n>0){
            int r=n%10;
            if(r>m)
                m=r;
            n=n/10;
        }
        return m;
    }
    public static int low(int n){
        int m=Integer.MAX_VALUE;
        while (n>0){
            int r=n%10;
            if(r<m)
                m=r;
            n=n/10;
        }
        return m;
    }
}
