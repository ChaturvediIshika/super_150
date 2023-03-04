package Codeforces;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Teleporters_Easy_Version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int arr[]=new int[n];
            int c= sc.nextInt();
            for (int i=0;i<n;i++)
                arr[i]= sc.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for (int i=0;i<n;i++){
                pq.add(arr[i]+i+1);
            }
            int cq=0;
            while (!pq.isEmpty()&& c>= pq.peek()){
                c-=pq.poll();
                cq++;
            }
            System.out.println(cq);
        }
    }
}
