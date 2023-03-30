package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class KosaRaju_Algo {
    private HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
    public KosaRaju_Algo(int v){
        for (int i=0;i<v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2){
        map.get(v1).put(v2,0);
    }
    public int kosaRaju(){
        HashSet<Integer> visited=new HashSet<>();
        Stack<Integer> st=new Stack<>();
        dfs(visited,st,0);
        HashMap<Integer,HashMap<Integer,Integer>> map2=new HashMap<>();
        System.out.println(map);
        transpose(map2);
        System.out.println(map2);
        visited=new HashSet<>();
        int c=0;
        while (!st.isEmpty()){
            int rv=st.pop();
            if(!visited.contains(rv)){
                dfs(map2,visited,rv);
                c++;
            }
        }
        return c;
    }

    private void dfs(HashMap<Integer, HashMap<Integer, Integer>> map2, HashSet<Integer> visited, int i) {
        visited.add(i);
        for (int nbrs:map2.get(i).keySet()){
            if(!visited.contains(nbrs))
                dfs(map2,visited,nbrs);
        }
    }

    private void transpose(HashMap<Integer, HashMap<Integer, Integer>> map2) {
        for (int key: map.keySet())
            map2.put(key,new HashMap<>());
        for (int key:map.keySet()){
            for (int nbrs:map.get(key).keySet()){
                map2.get(nbrs).put(key,0);
            }
        }
    }

    public void dfs(HashSet<Integer> visited,Stack<Integer> st,int i){
        visited.add(i);
        for (int nbrs:map.get(i).keySet()){
            if(!visited.contains(nbrs))
                dfs(visited,st,nbrs);
        }
        st.push(i);
    }

    public static void main(String[] args) {
        KosaRaju_Algo kr=new KosaRaju_Algo(5);
        kr.AddEdge(1,0);
        kr.AddEdge(0,2);
        kr.AddEdge(2,1);
        kr.AddEdge(0,3);
        kr.AddEdge(3,4);
        System.out.println(kr.kosaRaju());
    }
}
