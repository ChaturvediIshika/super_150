package Sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        Sort(a);
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void Sort(int a[]){
        for (int i=0;i<a.length-1;i++){//time Complexity O(n^2)
            int min=i;
            for (int j=i+1;j<a.length;j++){//space Complexity O(1) //unstable and inplace
                if(a[j]<a[min])
                    min=j;
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
    }
}
