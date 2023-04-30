package Codeforces_Daily_Question;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Deaths_Blessing {
    private static class abc{
        int a,b;
         public abc(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            PriorityQueue<abc> pq = new PriorityQueue<>((x, y) -> x.b - y.b);
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for (int i=0;i<n;i++)
                b[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                abc nn=new abc(a[i],b[i]);
                pq.add(nn);
            }
            long sum=0;
            while (pq.size()>1){
                abc x=pq.poll();
                sum+=x.a+x.b;
            }
            abc x=pq.poll();
            sum+=x.a;
            System.out.println(sum);
        }
    }
}
