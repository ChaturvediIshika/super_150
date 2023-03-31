package Codeforces_Daily_Question;

import java.util.*;

public class MST0_1 {
    List<TreeSet<Integer>> map=new ArrayList<>();
    MST0_1(int n){
        for (int i=0;i<n;i++)
            map.add(new TreeSet<>());
    }
    public void AddEdge(int v1,int v2){
        map.get(v1).add(v2);
        map.get(v2).add(v1);
    }
    public void mst(int n){
        TreeSet<Integer> hs=new TreeSet<>();
        for (int i=0;i<n;i++)
            hs.add(i);
        int c=0;
        for(int i=0;i<n;i++){
            if(!hs.contains(i))
                continue;
            c++;
            hs.remove(i);
            dfs(hs,i);
        }
        System.out.println(c-1);
    }
    public void dfs(TreeSet<Integer> uv,int s){
        List<Integer> l=new ArrayList<>();
        for(int i:uv){
            if(!map.get(s).contains(i)){
                l.add(i);
            }
        }
        for(int i:l){
            uv.remove(i);
        }
        for(int i:l){
            dfs(uv,i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        MST0_1 ms=new MST0_1(n);
        int m= sc.nextInt();
        for (int i=0;i<m;i++) {
            int v1 = sc.nextInt()-1;
            int v2 = sc.nextInt()-1;
            ms.AddEdge(v1, v2);
        }
        ms.mst(n);
    }
}
