package Codeforces;

import java.util.Scanner;

public class Vaccination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            int d=sc.nextInt();
            int w=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            //            for(int i=str2.length()-1;i>=0;i--)
//                str1+=str2.charAt(i);
//            for(int i=0;i<str1.length()-1;i++){
//                if(str1.charAt(i)==str1.charAt(i+1))
//                    c++;
//
            System.out.println(vaccine(n,k,d,w,a));
        }
    }
    public static int vaccine(int n,int k,int d,int w,int a[]){
        int m=0,e=0,s=0;
        for (int i=0;i<n;i++){
            if(m==0 || e<=a[i]){
                s++;
                m=k-1;
                e=a[i]+w+d+1;
            }
            else
                m--;
        }
        return s;
    }
}
