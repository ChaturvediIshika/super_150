package Queue;

import java.util.*;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        int a[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(max(a,k)));
    }

    public static int[] max(int a[], int k) {
        Deque<Integer> dq=new LinkedList<>();
        int ans[]=new int[a.length-k+1];
        int j=1;
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && a[i]>a[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        ans[0]=a[dq.getFirst()];
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
            ans[j++]=a[dq.getFirst()];
        }
        return ans;
    }
}