package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Bipartite {
    class Solution {
        public boolean isBipartite(int[][] graph) {
                HashMap<Integer,Integer> visited=new HashMap<>();
                Queue<Bipartite> q=new LinkedList<>();
                for (int src=0;src< graph.length;src++) {
                    if (visited.containsKey(src))
                        continue;
                    q.add(new Bipartite(src,0));
                    while (!q.isEmpty()) {
                        Bipartite rv = q.poll();
                        if (visited.containsKey(rv.vtx)){
                            if(visited.get(rv.vtx)!=rv.lv)
                                return false;
                            else
                                continue;
                        }
                        visited.put(rv.vtx,rv.lv+1);
                        for (int nbrs :graph[rv.vtx] ) {
                            if (!visited.containsKey(nbrs))
                                q.add(new Bipartite(nbrs,rv.lv+1));
                        }
                    }
                }
                return true;
        }
    }
    class Bipartite{
        int vtx;
        int lv;
        public Bipartite(int src,int lv){
            this.vtx=src;
            this.lv=lv;
        }
    }
}
