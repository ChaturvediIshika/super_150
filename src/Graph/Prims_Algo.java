package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prims_Algo {
    public class PrimsPair{
        int vtx;
        int acqvtx;
        int cost;
        PrimsPair(int vtx,int acqvtx,int cost){
            this.vtx=vtx;
            this.acqvtx=acqvtx;
            this.cost=cost;
        }
        public String toString(){
            return vtx+" - "+acqvtx+" @ "+cost;
        }
    }
    private HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
    public Prims_Algo(int v){
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void Prims(){
        System.out.println(map);
        int ans=0;
        PriorityQueue<PrimsPair> pq=new PriorityQueue<>((a,b)->a.cost- b.cost);
        HashSet<Integer> visited=new HashSet<>();
        pq.add(new PrimsPair(1,1,0));
        while (!pq.isEmpty()){
            PrimsPair pp=pq.remove();
            if(visited.contains(pp.vtx))
                continue;
            visited.add(pp.vtx);
            System.out.println(pp);
            ans+=pp.cost;
            for (int nbrs:map.get(pp.vtx).keySet()){
                if(!visited.contains(nbrs))
                    pq.add(new PrimsPair(nbrs,pp.vtx,map.get(pp.vtx).get(nbrs)));
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Prims_Algo pa=new Prims_Algo(n);
        int m= sc.nextInt();
        for (int i=0;i<m;i++){
            int v1= sc.nextInt();
            int v2=sc.nextInt();
            int cost= sc.nextInt();
            pa.AddEdge(v1,v2,cost);
        }
//        System.out.println(map);
        pa.Prims();
    }
}
//         4 5
//        1 2 10
//        2 3 15
//        1 3 5
//        4 2 2
//        4 3 40
