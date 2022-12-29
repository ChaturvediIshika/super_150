package GFG_POTD;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Maximum_of_all_subarrays_of_size_k {
    public static void main(String[] args) {
        int a[]={1,2,3,1,4,5,2,3,6};//1 2 3 1 4 5 2 3 6
        int k=3;
        System.out.println(maximum(a,k));
    }
    public static ArrayList<Integer> maximum(int a[],int k){
        ArrayList<Integer> ls=new ArrayList<>();
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && a[i]>a[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        ls.add(a[dq.getFirst()]);
        for(int i=k;i<a.length;i++)
        {
            while (!dq.isEmpty() && a[i]>a[dq.getLast()])
            {
                dq.removeLast();
            }
            dq.add(i);
            if(!dq.isEmpty() && dq.getFirst()==i-k)
            {
                dq.removeFirst();
            }
            ls.add(a[dq.getFirst()]);
        }
        return ls;
    }
}
