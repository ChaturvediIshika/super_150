package Codeforces_Daily_Question;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int s=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a[]=new int[2];
            a[0]=sc.nextInt();
            a[1]= sc.nextInt();
            pq.add(a);
        }
        while(n-->0){
            int a[]=pq.poll();
            if(a[0]<s){
                s+=a[1];
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
