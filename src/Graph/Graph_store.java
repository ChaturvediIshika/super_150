package Graph;

import java.util.HashMap;
import java.util.HashSet;

public class Graph_store {
    private HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
    public Graph_store(int v){
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean ContainsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int numOfEdge(){
        int sum=0;
        for (int i:map.keySet()){
            sum+=map.get(i).size();
        }
        return sum/2;
    }
    public void removeEdge(int v1,int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void vertexRemove(int v1){
        for(int i:map.get(v1).keySet()){
            map.get(i).remove(v1);
        }
        map.remove(v1);
    }
    public void display(){
        for (int i:map.keySet()){
            System.out.println(i+"->"+map.get(i));
        }
    }
    public boolean hasPath(int src, int dest, HashSet<Integer> visited){
        if(src==dest)
            return true;
        visited.add(src);
        for (int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, dest, visited);
                if (ans)
                    return true;
            }
        }
        visited.remove(src);
        return false;
    }
}
