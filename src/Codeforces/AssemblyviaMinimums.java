package Codeforces;

import java.util.*;

public class AssemblyviaMinimums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int s=(n*(n-1))/2;
            int a[]=new int[s];
            for (int i=0;i<s;i++)
                a[i]= sc.nextInt();
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for (int i:a){
                map.put(i,map.getOrDefault(i,0)+1);
            }
            assemble(map,n);
        }
    }
    public static long countPair(int a[]){
        boolean visited[]=new boolean[a.length];
        long ans=0;
        for(int i=31;i>=0;i--){
            long c=0;
            for(int j=0;j<a.length;j++){
                if((a[j] &(1<<i))!=0 && visited[j]!=true){
                    c++;
                    visited[j]=true;
                }
            }
            ans=ans+((c*(c-1))/2);
        }
        return ans;
    }
    public static void assemble(TreeMap<Integer,Integer> map,int n){
        int k=n-1;
        List<Integer> ls=new ArrayList<>();
        for (int key:map.keySet()){
            if(map.get(key)==k){
                ls.add(key);
                k--;
            }
            else {
                int q=map.get(key);
                int x=k,p=0;
                while (x>0 && q!=p){
                    p+=x;
                    ls.add(key);
                    x--;
                }
                k=x;
            }
//            System.out.println(key);
        }
        for(int i:ls)
            System.out.print(i+" ");
        int x=ls.size();
        while (x!=n){
            System.out.print(1000000000+" ");
            x++;
        }
        System.out.println();
    }
    public static void strong(int a[],int b[]){
        long min=Long.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            min=Math.max(min,a[i]-b[i]);
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<b.length;i++){
            if(min==a[i]-b[i])
                ls.add(i+1);
        }
        System.out.println(ls.size());
        for (int i:ls)
            System.out.print(i+" ");
        System.out.println();
    }
}
