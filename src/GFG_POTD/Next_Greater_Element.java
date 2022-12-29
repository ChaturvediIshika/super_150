package GFG_POTD;

import javax.swing.*;
import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        long arr[]={6,8,0,1,3};
        long a[]=greater(arr);
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    public static long[] greater(long arr[]){
        Stack<Integer> st=new Stack<>();
        long a[]=new long[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                a[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty())
            a[st.pop()]=-1;
        return a;
    }
}
