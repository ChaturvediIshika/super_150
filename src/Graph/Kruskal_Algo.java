package Graph;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Kruskal_Algo {
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
    public Kruskal_Algo(int v){
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
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
    public void Kruskal(){
        int sum=0;
        Disjoint_Set_Union dsu=new Disjoint_Set_Union();
        for (int key:map.keySet()){
            dsu.createSet(key);
        }
        ArrayList<EdgePair> ls=getAllEdge();
        Collections.sort(ls,(a,b)->a.cost-b.cost);
        for(EdgePair ep:ls){
            int e1=ep.e1;
            int e2=ep.e2;
            int rn1=dsu.find(e1);
            int rn2=dsu.find(e2);
            if(rn1!=rn2){
                sum+=ep.cost;
                System.out.println(ep);
                dsu.Union(rn1,rn2);
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Kruskal_Algo ka=new Kruskal_Algo(n);
        int m= sc.nextInt();
        for (int i=0;i<m;i++){
            int v1= sc.nextInt();
            int v2=sc.nextInt();
            int cost= sc.nextInt();
            ka.AddEdge(v1,v2,cost);
        }
        ka.Kruskal();
    }
}
