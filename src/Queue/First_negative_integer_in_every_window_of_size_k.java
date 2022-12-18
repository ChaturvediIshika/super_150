package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class First_negative_integer_in_every_window_of_size_k {
    public static void main(String[] args) {
        int a[]={12,-1,-7,8,-15,30,16,28};
        int k=3;
        int r[]=find(a,k);
        for(int i=0;i<r.length;i++)
            System.out.println(r[i]);
    }
    public static int[] find(int a[],int k){
        int n=a.length;
        int r[]=new int[n-k+1];
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(a[i]<0){
                dq.add(i);
            }
        }
        System.out.println(dq);
        if(dq.isEmpty())
            r[0]=0;
        else
            r[0]=a[dq.getFirst()];
        int j=1;
        for(int i=k;i<n;i++){               //{12,-1,-7,8,-15,30,16,28}
            System.out.println(dq);
            while(!dq.isEmpty() && dq.getFirst()<=i-k)
                dq.remove();
            if(a[i]<0)
                dq.add(i);
            if(!dq.isEmpty())
                r[j++]=a[dq.getFirst()];
        }
        return r;
    }
}
