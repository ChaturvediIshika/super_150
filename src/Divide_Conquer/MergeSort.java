package Divide_Conquer;

public class MergeSort {
    public static void main(String[] args) {
        int a[]={5,3,6,3,8,1};
        int q[]=Sort(a,0,a.length-1);
        for (int i=0;i<q.length;i++)
            System.out.println(q[i]);
    }
    public static int[] Sort(int[] a, int si, int ei)
    {
        if(si==ei)
        {
            int bs[]=new int[1];
            bs[0]=a[si];
            return bs;
        }
        int mid=(si+ei)/2;
        int f1[]=Sort(a,si,mid);
        int[] f2=Sort(a,mid+1,ei);
        int[] m=new int[f1.length+f2.length];
        merge(f1,f2,m);
        return m;
    }
    public static void merge(int[] a, int[] b, int[] m)
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
        while(j<b.length) {
            m[k] = b[j];
            j++;
            k++;
        }
    }
}
