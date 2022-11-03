package Divide_Conquer;

public class Partition {
    public static void main(String[] args) {
        int a[]={5,7,2,3,8,9,1,4};
        int ans=partition_Array(a,0,a.length-1);
        System.out.println(ans);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static int partition_Array(int a[],int si,int ei)
    {
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
}
