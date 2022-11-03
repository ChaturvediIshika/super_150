package Divide_Conquer;

public class Merge_2ArraySort {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5,6};
        int m[]=new int[a.length+b.length];
        merge(a,b,m);
        for (int i=0;i<a.length+b.length;i++)
        {
            System.out.println(m[i]);
        }
    }
    public static void merge(int a[],int b[],int m[])
    {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]>b[j])
            {
                m[k]=b[j];
                j++;
                k++;
            }
            else {
                m[k]=a[i];
                i++;
                k++;
            }
        }
        while(i<a.length)
        {
            m[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length)
        {
            m[k]=b[j];
            j++;
            k++;
        }
    }
}
