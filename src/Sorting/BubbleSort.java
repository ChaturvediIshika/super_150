package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={4,2,3,8,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int a[]){//best time Complexity O(n)
        for(int pass=1;pass<a.length;pass++){// Worst time Complexity O(n^2)
            for(int i=0;i<a.length-pass;i++){//Space Complexity O(1) // stable and inplace
                if(a[i]>a[i+1]){
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
    }
}
