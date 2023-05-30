package Assignment_4440;

import java.util.*;

public class Monu_bhaiya_and_spams {
    HashMap<Integer, HashSet<Integer>> map=new HashMap<>();
    HashMap<Integer,HashSet<Integer>> map2=new HashMap<>();
    Monu_bhaiya_and_spams(int n){
        for(int i=1;i<=n;i++){
            map.put(i,new HashSet<Integer>());
            map2.put(i,new HashSet<Integer>());
        }
    }
    public void addEdge(int v1,int v2){
        map.get(v1).add(v2);
        map.get(v2).add(v1);
    }
    public void MapNew(int n){
        for(int k:map.keySet()){
            for(int i=1;i<=n;i++){
                if(!map.get(k).contains(i)&& i!=k){
                    map2.get(k).add(i);
                }
            }
        }
        // System.out.println(map2);
        HashSet<Integer> hs=new HashSet<Integer>();
        Queue<Integer> q=new LinkedList<Integer>();
        int c=0;
        for(int i=1;i<=n;i++){
            if(hs.contains(i))
                continue;
            c++;
            q.add(i);
            while(!q.isEmpty()){
                int rv=q.poll();
                if(hs.contains(rv))
                    continue;
                hs.add(rv);

                for(int nbrs:map2.get(rv)){
                    if(!hs.contains(nbrs))
                        q.add(nbrs);
                }
            }
        }
        System.out.println(c);
    }
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mn=sc.nextInt();
        Monu_bhaiya_and_spams m=new Monu_bhaiya_and_spams(n);
        for(int i=0;i<mn;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            m.addEdge(v1,v2);
        }
        m.MapNew(n);
    }
}
