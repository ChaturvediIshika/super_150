package Assignment_Questions;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Unlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int m[]=new int[n];
        for(int i=0;i<n;i++) {
            m[i] = sc.nextInt();
            map.put(m[i], i);
            pq.add(m[i]);
        }
        int j=0;
        while (k>0 && j<n){
            int rev=pq.poll();
            if(map.get(rev)!=j){
                int s=map.get(rev);
                m[s]=m[j];
                m[j]=rev;
                map.put(rev,j);
                map.put(m[s],s);
                m[j]=rev;
                k--;
            }
            j++;
        }
        for (int i=0;i<n;i++)
            System.out.print(m[i]+" ");
    }
}
