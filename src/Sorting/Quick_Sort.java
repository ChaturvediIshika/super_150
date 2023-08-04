package Sorting;


public class Quick_Sort {
    public static void main(String[] args) {
        int a[]={1,4,3,2,5};
        Sort(a,0,a.length-1);
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void Sort(int a[],int l,int r){ //unstable and inplace
        if(l<r){
            int q=Partition(a,l,r);
            Sort(a,l,q);
            Sort(a,q+1,r);
        }
    }
    public static int Partition(int a[],int l,int r){
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
}
