package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Longest_Cycle_in_a_Graph {
    public static int[] degreeIn(int edges[]){
        int in[]=new int[edges.length];
        for(int key=0;key<in.length;key++){
            if (edges[key]!=-1)
                in[edges[key]]++;
        }
        return in;
    }
    public static int longestCycle(int[] edges) {
        int in[]=degreeIn(edges);
        boolean visited[]=new boolean[edges.length];
        Queue<Integer> q=new LinkedList<>();
        for (int i=0;i<in.length;i++){
            if(in[i]==0)
                q.add(i);
        }
        while (!q.isEmpty()){
            int rv=q.poll();
            visited[rv]=true;
            int nbrs=edges[rv];
            if(nbrs!=-1){
                in[nbrs]--;
                if(in[nbrs]==0)
                    q.add(nbrs);
            }
        }
        //count wala part
        int ans=-1;
        for (int i=0;i<visited.length;i++){
            if(!visited[i]){
                int count=1;
                int nbrs=edges[i];
                visited[i]=true;
                while (nbrs!=i){
                    visited[nbrs]=true;
                    count++;
                    nbrs=edges[nbrs];
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int edges[]={2,-1,3,1};
        System.out.println(longestCycle(edges));
    }
}
