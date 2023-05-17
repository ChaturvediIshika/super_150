package Sorting;

public class bubble_sort {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        sort(a);
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void sort(int a[]){
        for (int i=0;i<a.length;i++){
            for (int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
}
