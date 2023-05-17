package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        Sort(a);
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void Sort(int a[]){
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            for (;j>=0;j--){
                if(a[j]>key){
                    a[j+1]=a[j];
                }
            }
            a[j+1]=key;
        }
    }
}
