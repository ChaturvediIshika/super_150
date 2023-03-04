package Codeforces;

import java.util.Scanner;

public class Negatives_and_Positives {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println(sum(a));
        }
    }
    public static int sum(int a[]){
        for (int i=0;i<a.length-1;i++){
            if (a[i]>=0 && a[i+1]>=0)
                continue;
            if (a[i]<0 && a[i+1]<0){
                a[i]=a[i]*(-1);
                a[i+1]=a[i+1]*(-1);
            }
            else if (a[i]<0 && a[i]*(-1)>a[i+1]) {
                a[i]=a[i]*(-1);
                a[i+1]=a[i+1]*(-1);
            } else if (a[i]==0 && a[i+1]<0) {
                a[i+1]=a[i+1]*(-1);
            }
        }
        int s=0;
        for (int i=0;i<a.length;i++)
            s+=a[i];
        return s;
    }
}
