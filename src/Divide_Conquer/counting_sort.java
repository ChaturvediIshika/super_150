package Divide_Conquer;

import java.util.concurrent.CountedCompleter;

public class counting_sort {
    public static void Counting(int a[],int b[],int k){
        int c[]=new int[k+1];
        for(int j=0;j<a.length;j++){
            c[a[j]]=c[a[j]]+1;
        }
        for (int i=1;i<=k;i++){
            c[i]=c[i]+c[i-1];
        }
        for(int j=a.length-1;j>=0;j--){
            b[c[a[j]]-1]=a[j];
            c[a[j]]=c[a[j]]-1;
        }
    }
    public static void main(String[] args) {
        int a[]={2,5,3,0,2,3,0,3,4,8,7,0,10};
        int b[]=new int[a.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
            max=Math.max(max,a[i]);
        Counting(a,b,max);
        for (int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }
}
