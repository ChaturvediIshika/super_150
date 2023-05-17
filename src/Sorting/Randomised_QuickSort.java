package Sorting;

import java.util.Random;

public class Randomised_QuickSort {
    public static void main(String[] args) {
        int a[]={1,4,3,2,5};
        Sort(a,0,a.length-1);
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void Sort(int a[],int l,int r){
        if(l<r){
            int q=Partition(a,l,r);
            Sort(a,l,q);
            Sort(a,q+1,r);
        }
    }
    public static int Partition(int a[],int l,int r){
        swap(a,l,r);
        int x=a[l];
        int i=l-1;
        int j=r+1;
        while (true){
            j--;
            while (a[j]>x)
                j--;
            i++;
            while (a[i]<x)
                i++;
            if(i>=j) {
                return j;
            }
            else{
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    public static void swap(int a[],int si,int ei)
    {
        Random r=new Random();
        int rn=r.nextInt(ei-si+1)+si;
        int temp=a[rn];
        a[rn]=a[ei];
        a[ei]=temp;
    }
}
