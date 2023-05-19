package Assignment_4440;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Summer_Vacation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                a[i][j]= sc.nextInt();
        Arrays.sort(a,(p,q)->p[1]-q[1]);
        PriorityQueue<Integer> pq=new PriorityQueue<>((p,q)->q-p);
        int time=0;
        for(int i=0;i<a.length;i++){
            int d=a[i][0],l=a[i][1];
            if(time+d<=l){
                time+=d;
                pq.add(d);}
            else if(!pq.isEmpty() && pq.peek()>d){
                time+=d-pq.poll();
                pq.add(d);
            }
        }
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j < m; j++)
//                System.out.print(a[i][j]+" ");
//            System.out.println();
//        }
        System.out.println(pq.size());
    }
}
