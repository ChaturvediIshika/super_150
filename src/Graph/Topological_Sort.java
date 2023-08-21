package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort {
    private HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
    public Topological_Sort(int v){
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
    }
    public int[] degreeIn(){
        int in[]=new int[map.size()+1];
        for(int key:map.keySet()){
            for (int nbrs:map.get(key).keySet()){
                in[nbrs]++;
            }
        }
        return in;
    }
    public void topological(){
        System.out.println(map);
        int in[]=degreeIn();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<in.length;i++){
            if(in[i]==0)
                q.add(i);
        }
        int c=0;
        while (!q.isEmpty()){
            int rv=q.remove();
            c++;
            System.out.print(rv+" ");
            for (int k:map.get(rv).keySet()){
                in[k]--;
                if(in[k]==0)
                    q.add(k);
            }
        }
        if(c== map.size())
            System.out.println("NO cycle");
        else
            System.out.println("Cycle Detected");
    }

    public static void main(String[] args) {
        Topological_Sort ts=new Topological_Sort(8);
        ts.AddEdge(1,2,0);
        ts.AddEdge(1,3,0);
        ts.AddEdge(2,4,0);
        ts.AddEdge(3,1,0);
        ts.AddEdge(3,2,0);
        ts.AddEdge(4,5,0);
        ts.AddEdge(4,6,0);
        ts.AddEdge(5,6,0);
//        ts.AddEdge(7,8,0);
        ts.topological();
    }
}
