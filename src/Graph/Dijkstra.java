package Graph;

import java.util.*;

public class Dijkstra {
    private HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
    public Dijkstra(int v){
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    private class DijkstraPair{
        int vtx;
        String acp;
        int cost;
        public DijkstraPair(int vtx,String acp,int cost){
            this.vtx=vtx;
            this.acp=acp;
            this.cost=cost;
        }

        @Override
        public String toString() {
            return "DijkstraPair{" +
                    "vtx=" + vtx +
                    ", acp='" + acp + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
    public void Cost(){
        PriorityQueue<DijkstraPair> pq=new PriorityQueue<>(new Comparator<DijkstraPair>() {
            @Override
            public int compare(DijkstraPair o1, DijkstraPair o2) {
                return o1.cost-o2.cost;
            }
        });
        Set<Integer> visited=new HashSet<>();
        pq.add(new DijkstraPair(1,"1",0));
        while (!pq.isEmpty()){
            DijkstraPair rp=pq.remove();
            if(visited.contains(rp.vtx)){
                continue;
            }
            visited.add(rp.vtx);
            System.out.println(rp);
            for (int nbrs:map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost=rp.cost+map.get(rp.vtx).get(nbrs);
                    pq.add(new DijkstraPair(nbrs,rp.acp+nbrs,cost));
                }
            }
        }
    }
    public static void main(String args[]){
        Dijkstra dj=new Dijkstra(7);
        dj.AddEdge(1,4,6);
        dj.AddEdge(1,2,10);
        dj.AddEdge(2,3,7);
        dj.AddEdge(3,4,5);
        dj.AddEdge(4,5,1);
        dj.AddEdge(5,6,4);
        dj.AddEdge(7,5,3);
        dj.AddEdge(6,7,3);
        dj.Cost();
    }
}
