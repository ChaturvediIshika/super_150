package leetcode;

import java.util.PriorityQueue;

public class Remove_Stones_to_Minimize_the_Total {
    public static void main(String[] args) {
        int arr[]={4,3,6,7};
        int k=3;
        System.out.println(find(arr,k));
    }
    public static int find(int arr[],int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<arr.length;i++)
            pq.add(arr[i]);
        while(k-->0){
            int r=pq.remove();
            int rq=(int) Math.floor(r/2);
            pq.add(r-rq);
        }
        int sum=0;
        for(int n:pq)
            sum+=n;
        return sum;
    }
}
