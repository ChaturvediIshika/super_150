package Sorting;

import java.util.Random;

public class Random_Quick_Sort {
    public static void main(String[] args) {
        int a[]={3,5,8,5,0,2};
        Sort(a,0,a.length-1);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void Sort(int a[],int si,int ei)
    {
        if(si>ei)
            return;
        int pi=partition_Array(a,si,ei);
        Sort(a,si,pi-1);
        Sort(a,pi+1,ei);
    }
    public static int partition_Array(int a[],int si,int ei)
    {
        swap(a,si,ei);
        int item=a[ei];
        int pi=si;
        for(int i=si;i<ei;i++)
        {
            if(a[i]<item)
            {
                int temp=a[i];
                a[i]=a[pi];
                a[pi]=temp;
                pi++;
            }
        }
        int temp=a[ei];
        a[ei]=a[pi];
        a[pi]=temp;
        return pi;
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
