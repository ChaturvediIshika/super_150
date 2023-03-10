package Codeforces;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Likes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            HashSet<Integer> po=new HashSet<>();
            HashSet<Integer> ne=new HashSet<>();
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for (int i=0;i<n;i++){
                int q= sc.nextInt();
                if(q<0)
                    pq.add(q);
                else
                    po.add(q);
            }
            int pos=po.size();
            int nes=pq.size();
            int j=1;
            for (int i=0;i<n;i++) {
                if(i>=n-nes-1)
                    System.out.print((j--) + " ");
                else
                    System.out.print((j++) + " ");
            }
            System.out.println();
            j=1;

//            System.out.println(pq);
            for(int i=0;i<n;i++){
                if(!pq.isEmpty()){
                    pq.poll();
                    System.out.print(1+" "+0+" ");
                    i+=1;
                }
                else
                    System.out.print(j+++" ");
            }
            System.out.println();
        }
    }
}
