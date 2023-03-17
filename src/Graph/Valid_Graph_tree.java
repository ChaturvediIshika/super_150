package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Valid_Graph_tree {
    public boolean validTree(){
        HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
        HashSet<Integer> visited=new HashSet<>();
        Stack<Integer> q=new Stack<>();
        int c=0;
        for (int src: map.keySet()) {
            if (visited.contains(src))
                continue;
            c++;
            q.push(src);
            while (!q.isEmpty()) {
                int rv = q.pop();
                if (visited.contains(rv))
                    return false;
                visited.add(rv);
                System.out.print(rv+" ");
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs))
                        q.push(nbrs);
                }
            }
        }
        return c==1;
    }
}
