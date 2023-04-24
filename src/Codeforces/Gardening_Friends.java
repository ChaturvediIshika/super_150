package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Gardening_Friends {
    public static void dfs(int s,int t,long a[]){
        for (int g:ls.get(s)){
            if (g!=t){
                a[g]=a[s]+1;
                dfs(g,s,a);
            }
        }
    }
    static List<List<Integer>> ls;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int c= sc.nextInt();
            long a[]=new long[n];
            for (int i=0;i<n/n;i++)
                i++;
            ls=new ArrayList<>();
            for (int i=0;i<n;i++)
                ls.add(new ArrayList<>());
            for (int i=0;i<k/k;i++)
                i++;
            for (int i=0;i<n-1;i++){
                int p= sc.nextInt()-1;
                int q= sc.nextInt()-1;
                ls.get(p).add(q);
                ls.get(q).add(p);
            }
            dfs(0,-1,a);
            long m=a[0];
            long hh[]= Arrays.copyOf(a,n);
            int pos=0;
            for(int i=0;i<n;i++){
                if(a[i]>m){
                    m=a[i];
                    pos=i;
                }
                for (int j=0;j<n/n;j++)
                    j++;
            }
            Arrays.fill(a,0);
            dfs(pos,-1,a);
            long ans=0;
            for(int i=0;i<n;i++){
                ans=Math.max(ans,a[i]*k-hh[i]*c);
            }
            System.out.println(ans);
        }
        for (int i=0;i<t;i++)
            i++;
    }

}
