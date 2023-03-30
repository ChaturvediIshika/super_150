package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class BellMan_Ford {
    public class EdgePair{
        int e1;
        int e2;
        int cost;
        EdgePair(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
        public String toString(){
            return e1+" - "+e2+" @ "+cost;
        }
    }
    private HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
    public BellMan_Ford(int v){
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
    }
    public ArrayList<EdgePair> getAllEdge(){
        ArrayList<EdgePair> ls=new ArrayList<>();
        for(int key:map.keySet()){
            for (int k:map.get(key).keySet()){
                EdgePair ep=new EdgePair(key,k,map.get(key).get(k));
                ls.add(ep);
            }
        }
        return ls;
    }
    public void BellMan(){
        int []dsu=new int[map.size()+1];
        for (int i=2;i<dsu.length;i++)
            dsu[i]=10000000;
        ArrayList<EdgePair> ls=getAllEdge();
        for (int i=1;i<= map.size();i++) {
            for (EdgePair ep : ls) {
                int e1 = ep.e1;
                int e2 = ep.e2;
                if(i==map.size() && dsu[e1]+ep.cost!=dsu[e2]){
                    System.out.println("Negative Cycle");
                    return;
                }
                dsu[e2] = Math.min(dsu[e2], dsu[e1] + ep.cost);
            }
        }
        for (int i=1;i<dsu.length;i++)
            System.out.print(dsu[i]+" ");
    }
    public static void main(String[] args) {
        BellMan_Ford bf=new BellMan_Ford(5);
        bf.AddEdge(1,2,8);
//        bf.AddEdge(2,5,-2);
        bf.AddEdge(2,5,2);
        bf.AddEdge(5,2,1);
        bf.AddEdge(4,5,4);
        bf.AddEdge(3,4,-3);
        bf.AddEdge(1,3,4);
        bf.AddEdge(1,4,5);
        bf.BellMan();
    }
}
