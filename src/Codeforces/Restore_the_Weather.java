package Codeforces;

import java.util.*;

public class Restore_the_Weather {
     static class pair{
         int n,i;

         public pair(int i, int i1) {
             this.n=i;
             this.i=i1;
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
                b[i]= sc.nextInt();
            Arrays.sort(b);
            List<pair> ls=new ArrayList<>();
            for(int i=0;i<n;i++)
                ls.add(new pair(a[i],i));
            Collections.sort(ls,(p,q)->p.n-q.n);
            int index=0;
            int c[]=new int[n];
            for (pair p:ls){
                c[p.i]=b[index++];
            }
            for(int i:c)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
