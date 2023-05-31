package Graph;

import java.util.*;

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
    public void allPath(int src, int dest, HashSet<Integer> visited, String str){
        if(src==dest){
            System.out.println(str+src);
            return;
        }
        visited.add(src);
        for (int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)) {
                allPath(nbrs, dest, visited,str+src);
            }
        }
        visited.remove(src);
    }
    public boolean BFS(int src,int des){ //guarantees short path
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()){
            int rv=q.poll();
            if(visited.contains(rv))
                continue;
            visited.add(rv);
            if(rv==des){
                return true;
            }
            for (int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs))
                    q.add(nbrs);
            }
        }
        return false;
    }
    public boolean DFS(int src,int des){ //does not guarantee short path
        HashSet<Integer> visited=new HashSet<>();
        Stack<Integer> q=new Stack<>();
        q.push(src);
        while (!q.isEmpty()){
            int rv=q.pop();
            if(visited.contains(rv))
                continue;
            visited.add(rv);
            if(rv==des){
                return true;
            }
            for (int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs))
                    q.push(nbrs);
            }
        }
        return false;
    }
    public void BFT(){
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        for (int src: map.keySet()) {
            if (visited.contains(src))
                continue;
            q.add(src);
            while (!q.isEmpty()) {
                //remove
                int rv = q.poll();
                //ignore
                if (visited.contains(rv))
                    continue;
                //visited
                visited.add(rv);
                //self work
                System.out.print(rv + " ");
                //add neighbours
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs))
                        q.add(nbrs);
                }
            }
            System.out.println();
        }
    }
    public void DFT(){
        HashSet<Integer> visited=new HashSet<>();
        Stack<Integer> q=new Stack<>();
        for (int src: map.keySet()) {
            if (visited.contains(src))
                continue;
            q.push(src);
            while (!q.isEmpty()) {
                int rv = q.pop();
                if (visited.contains(rv))
                    continue;
                visited.add(rv);
                System.out.print(rv+" ");
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs))
                        q.push(nbrs);
                }
            }
        }
    }

}
