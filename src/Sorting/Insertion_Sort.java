package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int a[]={11,2,3,4,5};
        Sort(a);
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void Sort(int a[]){//best time Complexity O(n)
        int z=1;
        for(int i=1;i<a.length;i++){//worst time complexity O(n^2)
            int key=a[i];//space complexity O(1)
            int j=i-1;
            while (j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            j++;
            a[j]=key;
        }
    }
}
