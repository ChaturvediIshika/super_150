package Codeforces;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Powering_the_Hero_Easy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println(power(a,n));
        }
    }
    public static long power(int a[],int n){
        PriorityQueue<Integer> pq=new PriorityQueue<>((p,q)->q-p);
        long k=0;
        for(int i=0;i<n;i++){
            if(!pq.isEmpty() && a[i]==0){
                k+=pq.peek();
                pq.poll();
            }
            else {
                pq.add(a[i]);
            }
        }
        return k;
    }
}
